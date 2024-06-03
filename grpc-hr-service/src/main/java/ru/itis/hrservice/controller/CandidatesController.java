package ru.itis.hrservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.hrservice.dto.GetCandidatesResponse;
import ru.itis.hrservice.service.HRService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/candidates")
public class CandidatesController {
    private final HRService hrService;

    @GetMapping
    public ResponseEntity<GetCandidatesResponse> getCandidates() {
        return ResponseEntity.ok(GetCandidatesResponse.builder()
                .pairs(hrService.getPairs())
                .build());
    }
}
