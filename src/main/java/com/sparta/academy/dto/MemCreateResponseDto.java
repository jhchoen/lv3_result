package com.sparta.academy.dto;

import com.sparta.academy.entity.Mem;

import java.time.LocalDateTime;

public class MemCreateResponseDto {
    private Long id;
    private String name;
    private String company;
    private String career;
    private String phone;
    private String info;
    private LocalDateTime createDt;
    private LocalDateTime modifyDt;

    public MemCreateResponseDto(Mem mem) {
        this.id = mem.getId();
        this.name = mem.getName();
        this.company = mem.getCompany();
        this.career = mem.getCareer();
        this.phone = mem.getPhone();
        this.info = mem.getInfo();
        this.createDt = mem.getCreateDt();
        this.modifyDt = mem.getModifyDt();
    }
}
