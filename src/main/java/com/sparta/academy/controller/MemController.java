package com.sparta.academy.controller;

import com.sparta.academy.dto.MemRequestDto;
import com.sparta.academy.dto.MemResponseDto;
import com.sparta.academy.dto.MemUpdateResponseDto;
import com.sparta.academy.service.MemService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemController {
    private final MemService memService;

    public MemController(MemService memService) {
        this.memService = memService;
    }

    @PostMapping("/mem")
    public MemResponseDto createMem(@RequestBody MemRequestDto requestDto) {
        return memService.createMem(requestDto);
    }

    @GetMapping("/mem")
    public MemResponseDto getMem(@RequestParam Long id) {
        return memService.getMem(id);
    }

    @PutMapping("/mem")
    public MemUpdateResponseDto updateMem(@RequestParam Long id, @RequestBody MemRequestDto requestDto) {
        return memService.updateMem(id, requestDto);
    }
}
