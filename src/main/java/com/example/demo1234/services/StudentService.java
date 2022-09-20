package com.example.demo1234.services;

import com.example.demo1234.models.StudentModel;
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
                           String groupNumber){
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setLastName(lastName);
        studentModel.setGroup(groupRepo.findByNumber(groupNumber));

        studentRepo.save(studentModel);
    }
}
