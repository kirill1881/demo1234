package com.example.demo1234.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student1")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "student_name")
    String name;

    @Column(name = "student_last_name")
    String lastName;

    @OneToOne
    @JoinColumn(name = "group_number")
    Group group;
}
