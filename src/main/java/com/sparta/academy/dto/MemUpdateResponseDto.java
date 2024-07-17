package com.sparta.academy.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemUpdateResponseDto {
    private Long id;
    private String name;
    private String company;
    private String career;
    private String phone;
    private String info;
    private LocalDateTime createDt;

    public MemUpdateResponseDto(Long id, String name, String company, String career, String phone, String info, LocalDateTime createDt) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.career = career;
        this.phone = phone;
        this.info = info;
        this.createDt = createDt;
    }
}
