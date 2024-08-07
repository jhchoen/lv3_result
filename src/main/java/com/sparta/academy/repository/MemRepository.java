package com.sparta.academy.repository;

import com.sparta.academy.entity.Mem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemRepository extends JpaRepository<Mem, Long> {
}
