package com.example.demo1234.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "student_group1")
@Data
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "number_of_students")
    int students;

    @Column(name = "group_number")
    int number;

    @OneToOne
    @JoinColumn(name = "grade")
    Grade grade;
}
