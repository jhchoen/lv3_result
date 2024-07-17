package com.sparta.academy.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class EduUpdateResponseDto {
    private Long id;
    private String name;
    private int price;
    private String info;
    private String eduType;
    private String memName;
    private LocalDateTime createDt;

    public EduUpdateResponseDto(Long id, String name, int price, String info, String eduType, String memName, LocalDateTime createDt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.info = info;
        this.eduType = eduType;
        this.memName = memName;
        this.createDt = createDt;
    }
}
