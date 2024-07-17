package com.sparta.academy.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class EduRequestDto {
    private String name;
    private int price;
    private String info;
    private String eduType;
    private String memName;
}
