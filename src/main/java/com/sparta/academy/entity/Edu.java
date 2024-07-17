package com.sparta.academy.entity;

import com.sparta.academy.dto.EduRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;

@AllArgsConstructor
@Entity
@Getter
@Table(name = "edu")
@NoArgsConstructor
public class Edu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private int price;

    @Column(nullable = false, length = 500)
    private String info;

    @Column(nullable = false, length = 100)
    private String eduType;

//    @ManyToOne
//    @JoinColumn(name = "mem_id", nullable = false)
//    private Mem mem;

    @Column(nullable = false, length = 30)
    private String memName;

    @Column(nullable = false)
    private LocalDateTime createDt;

    public Edu(EduRequestDto requestDto) {
        this.name = requestDto.getName();
        this.price = requestDto.getPrice();
        this.info = requestDto.getInfo();
        this.eduType = requestDto.getEduType();
        this.memName = requestDto.getMemName();
        this.createDt = LocalDateTime.now();
    }

    public void eduUpdate(String name, int price, String info, String eduType, String memName) {
        this.name = name;
        this.price = price;
        this.info = info;
        this.eduType = eduType;
        this.memName = memName;
    }
}
