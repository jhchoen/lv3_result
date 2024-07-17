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


}
