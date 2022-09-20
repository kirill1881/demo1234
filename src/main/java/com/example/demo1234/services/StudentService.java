package com.example.demo1234.services;

import com.example.demo1234.models.Group;
import com.example.demo1234.models.StudentModel;
import com.example.demo1234.models.helpers.GradeEnum;
import com.example.demo1234.repos.GroupRepo;
import com.example.demo1234.repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    @Autowired
    GroupRepo groupRepo;

    public void addStudent(String name, String lastName,
                           int groupNumber, int gradeNumber){
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setLastName(lastName);
        Group group = groupRepo.findByNumberAndGrade_GradeEnum(groupNumber,
                GradeEnum.values()[gradeNumber-1]);
        group.setStudents(group.getStudents()+1);
        studentModel.setGroup(group);

        studentRepo.save(studentModel);
    }
}
