package com.example.demo1234.controllers;

import com.example.demo1234.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/add/{name}/{lastName}/{groupNumber}/{gradeNumber}")
    public void saveStudent(@PathVariable String name,
                            @PathVariable String lastName,
                            @PathVariable int groupNumber,
                            @PathVariable int gradeNumber){
        studentService.addStudent(name, lastName, groupNumber, gradeNumber);
    }
}
