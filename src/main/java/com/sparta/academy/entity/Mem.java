package com.sparta.academy.entity;

import com.sparta.academy.dto.MemRequestDto;
import com.sparta.academy.dto.MemResponseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Entity
@Getter
@Table(name = "mem")
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

//    @OneToMany(mappedBy = "mem")
//    private List<Edu> edus;

    public Mem(MemRequestDto requestDto) {
        this.name = requestDto.getName();
        this.company = requestDto.getCompany();
        this.career = requestDto.getCareer();
        this.phone = requestDto.getPhone();
        this.info = requestDto.getInfo();
        this.createDt = LocalDateTime.now();
    }


    public void memUpdate(String name, String company, String career, String phone, String info) {
        this.name = name;
        this.company = company;
        this.career = career;
        this.phone = phone;
        this.info = info;
    }
}
