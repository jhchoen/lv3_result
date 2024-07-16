package com.sparta.academy.entity;

import com.sparta.academy.dto.MemRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@Entity
@Getter
@Table(name="mems")
@NoArgsConstructor
public class Mem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 50)
    private String company;

    @Column(nullable = false, length = 50)
    private String career;

    @Column(nullable = false, length = 30)
    private String phone;

    @Column(nullable = false, length = 255)
    private String info;

    @Column(nullable = false)
    private LocalDateTime createDt;

    @Column(nullable = false)
    private LocalDateTime modifyDt;

    public Mem(MemRequestDto requestDto) {
        this.name = requestDto.getName();
        this.company = requestDto.getCompany();
        this.career = requestDto.getCareer();
        this.phone = requestDto.getPhone();
        this.info = requestDto.getInfo();
        this.createDt = LocalDateTime.now();
        this.modifyDt = LocalDateTime.now();
    }
    @PreUpdate
    public void preUpdate() {
        this.modifyDt = LocalDateTime.now();
    }
}
