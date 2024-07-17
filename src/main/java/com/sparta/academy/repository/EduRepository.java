package com.sparta.academy.repository;

import com.sparta.academy.entity.Edu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduRepository extends JpaRepository<Edu, Long> {
}
