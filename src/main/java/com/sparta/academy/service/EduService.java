package com.sparta.academy.service;

import com.sparta.academy.dto.EduRequestDto;
import com.sparta.academy.dto.EduResponseDto;
import com.sparta.academy.entity.Edu;
import com.sparta.academy.repository.EduRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EduService {

    private final EduRepository eduRepository;

    public EduService(EduRepository eduRepository) {
        this.eduRepository = eduRepository;
    }


    @Transactional
    public EduResponseDto createEdu(EduRequestDto requestDto) {
        Edu edu = new Edu(requestDto);
        eduRepository.save(edu);
        return new EduResponseDto(edu);
    }

    public EduResponseDto getEdu(Long id) {
        Edu edu = eduRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("ID 오입력 및 없는 ID : " + id)
        );
        return new EduResponseDto(edu);
    }

    @Transactional
    public EduResponseDto updateEdu(Long id, EduRequestDto requestDto) {
        Edu edu = eduRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("ID : " + id + "가 잘못되었습니다.")
        );
        edu.eduUpdate(
                requestDto.getName(),
                requestDto.getPrice(),
                requestDto.getInfo(),
                requestDto.getEduType(),
                requestDto.getMemName()
        );
        eduRepository.save(edu);
        return new EduResponseDto(edu);
    }
}
