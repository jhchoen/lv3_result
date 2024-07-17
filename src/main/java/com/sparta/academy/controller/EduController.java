package com.sparta.academy.controller;

import com.sparta.academy.dto.EduRequestDto;
import com.sparta.academy.dto.EduResponseDto;
import com.sparta.academy.service.EduService;
import org.springframework.web.bind.annotation.*;

@RestController
public class EduController {

    private final EduService eduService;

    public EduController(EduService eduService) {
        this.eduService = eduService;
    }

    @PostMapping("/edu")
    public EduResponseDto createEdu(EduRequestDto requestDto) {
        return eduService.createEdu(requestDto);
    }

    @GetMapping("/edu")
    public EduResponseDto getEdu(@RequestParam Long id) {
        return eduService.getEdu(id);
    }

    @PutMapping("/edu")
    public EduResponseDto updateEdu(@RequestParam Long id, EduRequestDto requestDto) {
        return eduService.updateEdu(id, requestDto);
    }
}
