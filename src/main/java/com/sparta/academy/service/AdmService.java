package com.sparta.academy.service;

import com.sparta.academy.dto.AdmRequestDto;
import com.sparta.academy.dto.AdmResponseDto;
import com.sparta.academy.entity.Adm;
import com.sparta.academy.repository.AdmRepository;
import org.springframework.stereotype.Service;

@Service
public class AdmService {

    private final AdmRepository admRepository;

    public AdmService(AdmRepository admRepository) {
        this.admRepository = admRepository;
    }

    public AdmResponseDto createAdm(AdmRequestDto requestDto) {
        Adm adm = new Adm(requestDto);
        admRepository.save(adm);
        return new AdmResponseDto(adm);
    }

    public AdmResponseDto getAdm(Long id) {
        return admRepository.findById(id).map(AdmResponseDto::new).orElse(null);
    }
}
