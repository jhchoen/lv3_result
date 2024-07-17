package com.sparta.academy.dto;

import com.sparta.academy.entity.Edu;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class EdugetMemNameResponseDto {
    private Long id;
    private String name;
    private int price;
    private String info;
    private String eduType;
    private String memName;
    private LocalDateTime createDt;

    public EdugetMemNameResponseDto(Edu edu) {
        this.id = edu.getId();
        this.name = edu.getName();
        this.price = edu.getPrice();
        this.info = edu.getInfo();
        this.eduType = edu.getEduType();
        this.memName = edu.getMemName();
        this.createDt = edu.getCreateDt();
    }
}
