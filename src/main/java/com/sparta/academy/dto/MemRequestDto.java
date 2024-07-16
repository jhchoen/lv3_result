package com.sparta.academy.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemRequestDto {
    private String name;
    private String company;
    private String career;
    private String phone;
    private String info;
    private LocalDateTime createDt;
    private LocalDateTime modifyDt;
}
