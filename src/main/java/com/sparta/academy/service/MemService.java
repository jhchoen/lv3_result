package com.sparta.academy.service;

import com.sparta.academy.dto.MemCreateResponseDto;
import com.sparta.academy.dto.MemRequestDto;
import com.sparta.academy.dto.MemResponseDto;
import com.sparta.academy.entity.Adm;
import com.sparta.academy.entity.Mem;
import com.sparta.academy.repository.MemRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@Service
public class MemService {
    private final MemRepository memRepository;

    public MemService(MemRepository memRepository) {
        this.memRepository = memRepository;
    }


    public MemCreateResponseDto createMem(MemRequestDto requestDto) {
        Mem mem = new Mem(requestDto);
        memRepository.save(mem);
        return new MemCreateResponseDto(mem);
    }

    public MemResponseDto getMem(Long id) {
        Mem mem = memRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("ID 오입력 및 없는 ID : " + id)
        );
        return new MemResponseDto(mem);
    }

    public MemResponseDto updateMem(Long id, MemRequestDto requestDto) {
        int updatedCount = memRepository.updateMem(
                id,
                requestDto.getName(),
                requestDto.getCareer(),
                requestDto.getCompany(),
                requestDto.getPhone(),
                requestDto.getInfo()
        );
        if (updatedCount == 0) {
            throw new RuntimeException("업데이트 할 ID가 없거나 잘못되었습니다. : " + id);
        }
        Mem mem = memRepository.findById(id).orElseThrow();
        return new MemResponseDto(mem);
    }
}
