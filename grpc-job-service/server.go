package main

import (
	"context"

	"github.com/modylegi/grpc-job-service/proto"
)

type CVServiceServer struct {
	svc Service
	proto.UnimplementedJobServiceServer
}

func NewCVServiceServer(svc Service) *CVServiceServer {
	return &CVServiceServer{
		svc: svc,
	}
}

func (s *CVServiceServer) GetAllJobs(ctx context.Context, _ *proto.GetAllJobsRequest) (*proto.GetAllJobsResponse, error) {
	cvs, err := s.svc.GetAllJobs(ctx)
	if err != nil {
		return nil, err
	}
	var jobResponses []*proto.JobResponse
	for _, job := range cvs {
		jobResponses = append(jobResponses, &proto.JobResponse{
			Id:          job.ID.Hex(),
			Requirement: job.Requirement,
		})
	}
	return &proto.GetAllJobsResponse{
		Jobs: jobResponses,
	}, nil
}
