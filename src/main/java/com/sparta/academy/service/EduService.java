package com.sparta.academy.service;

import com.sparta.academy.dto.*;
import com.sparta.academy.entity.Edu;
import com.sparta.academy.repository.EduRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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
    public EduUpdateResponseDto updateEdu(Long id, EduRequestDto requestDto) {
        Edu edu = eduRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("ID : " + id + "가 잘못되었습니다.")
        );
        edu.edu(
                requestDto.getName(),
                requestDto.getPrice(),
                requestDto.getInfo(),
                requestDto.getEduType(),
                requestDto.getMemName()
        );
        eduRepository.save(edu);
        return new EduUpdateResponseDto(
                edu.getId(),
                edu.getName(),
                edu.getPrice(),
                edu.getInfo(),
                edu.getEduType(),
                edu.getMemName(),
                edu.getCreateDt()
        );
    }

    public List<EdugetAllResponseDto> getEdus() {
        List<Edu> edus = eduRepository.findAll();
        List<EdugetAllResponseDto> eduList = new ArrayList<>();
        for (Edu edu : edus) {
            eduList.add(new EdugetAllResponseDto(edu));
        }
        return eduList;
    }

    public List<EdugetMemNameResponseDto> getEduMemName(String memName) {
        List<Edu> edus = eduRepository.findAllByMemName(memName);
        List<EdugetMemNameResponseDto> eduList = new ArrayList<>();
        for (Edu edu : edus) {
            eduList.add(new EdugetMemNameResponseDto(edu));
        }
        return eduList;
    }

    public List<EdugetEduNameResponseDto> getEduEduName(String eduName) {
        List<Edu> edus = eduRepository.findAllByName(eduName);
        List<EdugetEduNameResponseDto> eduList = new ArrayList<>();
        for (Edu edu : edus) {
            eduList.add(new EdugetEduNameResponseDto(edu));
        }
        return eduList;
    }
}
