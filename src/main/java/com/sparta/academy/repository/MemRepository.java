package com.sparta.academy.repository;

import com.sparta.academy.entity.Mem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Repository
public interface MemRepository extends JpaRepository<Mem, Long> {
    @Modifying
    @Transactional
    @Query(
            " UPDATE Mem SET name=:name, career=:career, company=:company, phone=:phone, info=:info WHERE id=:id "
    )
    int updateMem(
            @Param("id") Long id,
            @Param("name") String name,
            @Param("career") String career,
            @Param("company") String company,
            @Param("phone") String phone,
            @Param("info") String info
    );
}
