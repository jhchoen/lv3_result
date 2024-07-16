package com.sparta.academy.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AdmRequestDto {
    private String email;
    private String passwd;
    private String dept;
    private String auth;
    private LocalDateTime createDt;
    private LocalDateTime modifyDt;

}
