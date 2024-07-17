package com.sparta.academy.repository;

import com.sparta.academy.entity.Edu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EduRepository extends JpaRepository<Edu, Long> {
    List<Edu> findAllByMemName(String memName);

    List<Edu> findAllByName(String eduName);
}
