package ru.itis.hrservice.service.impl;

import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import ru.itis.hrservice.dto.CV;
import ru.itis.hrservice.dto.CvJobPair;
import ru.itis.hrservice.dto.Job;
import ru.itis.hrservice.grpc.pb.cv.CVServiceGrpc;
import ru.itis.hrservice.grpc.pb.job.GetAllJobsRequest;
import ru.itis.hrservice.grpc.pb.cv.GetAllCVsRequest;
import ru.itis.hrservice.grpc.pb.job.JobServiceGrpc;
import ru.itis.hrservice.service.HRService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HRServiceGrpcClientImpl implements HRService {

    @GrpcClient("job-service")
    private JobServiceGrpc.JobServiceBlockingStub jobService;

    @GrpcClient("cv-service")
    private CVServiceGrpc.CVServiceBlockingStub cvService;


    @Override
    public List<CvJobPair> getPairs() {
        List<Job> jobs = fetchAllJobs();
        List<CV> cvs = fetchAllCVs();
        return findMatchingPairs(jobs, cvs);
    }

    private List<Job> fetchAllJobs() {
        var jobsResponse = jobService.getAllJobs(GetAllJobsRequest.newBuilder().build());
        return jobsResponse.getJobsList().stream()
                .map(j -> Job.builder()
                        .id(j.getId())
                        .requirement(j.getRequirement())
                        .build())
                .collect(Collectors.toList());
    }

    private List<CV> fetchAllCVs() {
        var cvsResponse = cvService.getAllCVs(GetAllCVsRequest.newBuilder().build());
        return cvsResponse.getCvsList().stream()
                .map(c -> CV.builder()
                        .id(c.getId())
                        .skill(c.getSkill())
                        .build())
                .collect(Collectors.toList());
    }

    private List<CvJobPair> findMatchingPairs(List<Job> jobs, List<CV> cvs) {
        List<CvJobPair> pairs = new ArrayList<>();

        for (Job job : jobs) {
            for (CV cv : cvs) {
                if (job.getRequirement().equals(cv.getSkill())) {
                    pairs.add(CvJobPair.builder()
                            .cv(cv)
                            .job(job)
                            .build());
                }
            }
        }

        return pairs;
    }

}
