package ru.itis.hrservice.service;

import ru.itis.hrservice.dto.CvJobPair;

import java.util.List;

public interface HRService {
    List<CvJobPair> getPairs();
}
