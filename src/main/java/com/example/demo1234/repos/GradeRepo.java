package com.example.demo1234.repos;

import com.example.demo1234.models.Grade;
import com.example.demo1234.models.helpers.GradeEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepo extends JpaRepository<Grade, Long> {
    Grade findByGradeEnum(GradeEnum gradeEnum);
}
