package com.sparta.academy.dto;

import com.sparta.academy.entity.Adm;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AdmResponseDto {
    private Long id;
    private String email;
    private String passwd;
    private String dept;
    private String auth;

    public AdmResponseDto(Adm adm) {
        this.id = adm.getId();
        this.email = adm.getEmail();
        this.passwd = adm.getPasswd();
        this.dept = adm.getDept();
        this.auth = adm.getAuth();
    }

}
