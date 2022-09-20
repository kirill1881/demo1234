package com.example.demo1234.services;

import com.example.demo1234.models.Grade;
import com.example.demo1234.models.helpers.GradeEnum;
import com.example.demo1234.repos.GradeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
    @Autowired
    GradeRepo gradeRepo;

    public void creatGrade(){
        Grade grade = new Grade();
        grade.setGradeEnum(GradeEnum.FIRST);
        grade.setNumber(0);

        gradeRepo.save(grade);
    }
}
