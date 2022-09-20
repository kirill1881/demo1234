package com.example.demo1234.repos;

import com.example.demo1234.models.Group;
import com.example.demo1234.models.helpers.GradeEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepo extends JpaRepository<Group, Long> {
    Group findByNumber(int number);
    Group findByNumberAndGrade_GradeEnum(int number,
                                         GradeEnum gradeEnum);
}
