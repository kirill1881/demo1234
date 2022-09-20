package com.example.demo1234.services;

import com.example.demo1234.models.Group;
import com.example.demo1234.models.helpers.GradeEnum;
import com.example.demo1234.repos.GradeRepo;
import com.example.demo1234.repos.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
    @Autowired
    GroupRepo groupRepo;

    @Autowired
    GradeRepo gradeRepo;

    public void saveGroup(int groupNumber, int gradeNumber){
        Group group = new Group();

        group.setNumber(gradeNumber);
        group.setGrade(gradeRepo.
                findByGradeEnum(GradeEnum.values()[gradeNumber]));
        groupRepo.save(group);
    }
}
