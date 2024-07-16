package com.sparta.academy.controller;

import com.sparta.academy.dto.AdmRequestDto;
import com.sparta.academy.dto.AdmResponseDto;
import com.sparta.academy.repository.AdmRepository;
import com.sparta.academy.service.AdmService;
import org.springframework.web.bind.annotation.*;


@RestController
public class AdmController {
    private final AdmService admService;

    public AdmController(AdmService admService) {
        this.admService = admService;
    }


    @PostMapping("/adm")
    public AdmResponseDto createAdm(@RequestBody AdmRequestDto requestDto) {
        return admService.createAdm(requestDto);
    }

    @GetMapping("/adm")
    public AdmResponseDto getAdm(@RequestParam Long id) {
        return admService.getAdm(id);
    }


}
