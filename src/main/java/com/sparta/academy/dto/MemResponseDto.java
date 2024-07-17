package com.sparta.academy.dto;

import com.sparta.academy.entity.Mem;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemResponseDto {
    private Long id;
    private String name;
    private String company;
    private String career;
    private String phone;
    private String info;
    private LocalDateTime createDt;

    public MemResponseDto(Mem mem) {
        this.id = mem.getId();
        this.name = mem.getName();
        this.company = mem.getCompany();
        this.career = mem.getCareer();
        this.phone = mem.getPhone();
        this.info = mem.getInfo();
        this.createDt = mem.getCreateDt();
    }

    public MemResponseDto(Long id, String name, String company, String career, String phone, String info, LocalDateTime createDt) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.career = career;
        this.phone = phone;
        this.info = info;
        this.createDt = createDt;
    }


}
