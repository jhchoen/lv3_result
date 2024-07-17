package com.sparta.academy.entity;

import com.sparta.academy.dto.AdmRequestDto;
import com.sparta.academy.dto.AdmResponseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@Entity
@Getter
@Table(name="adm")
@NoArgsConstructor
public class Adm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 10)
    private String dept;

    @Column(nullable = false, length = 10)
    private String auth;

    @Column(nullable = false, length = 500)
    private String passwd;

    public Adm(AdmRequestDto requestDto){
        this.email = requestDto.getEmail();
        this.dept = requestDto.getDept();
        this.auth = requestDto.getAuth();
        this.passwd = requestDto.getPasswd();
    }


}
