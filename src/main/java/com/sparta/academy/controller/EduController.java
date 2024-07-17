package com.sparta.academy.controller;

import com.sparta.academy.dto.*;
import com.sparta.academy.service.EduService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EduController {

    private final EduService eduService;

    public EduController(EduService eduService) {
        this.eduService = eduService;
    }

    @PostMapping("/edu")
    public EduResponseDto createEdu(@RequestBody EduRequestDto requestDto) {
        return eduService.createEdu(requestDto);
    }

    @GetMapping("/edu")
    public EduResponseDto getEdu(@RequestParam Long id) {
        return eduService.getEdu(id);
    }

    @GetMapping("/edu/")
    public List<EdugetAllResponseDto> getEdus() {
        return eduService.getEdus();
    }

    @GetMapping("/edu/memName")
    public List<EdugetMemNameResponseDto> getEduMemName(@RequestParam String memName) {
        return eduService.getEduMemName(memName);
    }

    @GetMapping("/edu/eduName")
    public List<EdugetEduNameResponseDto> getEduEduName(@RequestParam String eduName) {
        return eduService.getEduEduName(eduName);
    }

    @PutMapping("/edu")
    public EduUpdateResponseDto updateEdu(@RequestParam Long id, @RequestBody EduRequestDto requestDto) {
        return eduService.updateEdu(id, requestDto);
    }
}
