package com.sparta.academy.service;

import com.sparta.academy.dto.MemRequestDto;
import com.sparta.academy.dto.MemResponseDto;
import com.sparta.academy.dto.MemUpdateResponseDto;
import com.sparta.academy.entity.Mem;
import com.sparta.academy.repository.MemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemService {
    private final MemRepository memRepository;

    public MemService(MemRepository memRepository) {
        this.memRepository = memRepository;
    }

    @Transactional
    public MemResponseDto createMem(MemRequestDto requestDto) {
        Mem mem = new Mem(requestDto);
        memRepository.save(mem);
        return new MemResponseDto(mem);
    }

    public MemResponseDto getMem(Long id) {
        Mem mem = memRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("ID 오입력 및 없는 ID : " + id)
        );
        return new MemResponseDto(mem);
    }

    @Transactional
    public MemUpdateResponseDto updateMem(Long id, MemRequestDto requestDto) {
        Mem mem = memRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("ID : " + id + "가 잘못되었습니다.")
        );
        mem.memUpdate(
                requestDto.getName(),
                requestDto.getCompany(),
                requestDto.getCareer(),
                requestDto.getPhone(),
                requestDto.getInfo()
        );
        memRepository.save(mem);
        return new MemUpdateResponseDto(
                mem.getId(),
                mem.getName(),
                mem.getCompany(),
                mem.getCareer(),
                mem.getPhone(),
                mem.getInfo(),
                mem.getCreateDt()
        );
    }
}
