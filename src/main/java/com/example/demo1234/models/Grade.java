package com.example.demo1234.models;

import com.example.demo1234.models.helpers.GradeEnum;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "student_grade1")
@Data
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "grade")
    @Enumerated
    GradeEnum gradeEnum;

    @Column(name = "number_of_students")
    int number;
}
