package com.example.demo1234.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student_lessons1")
public class LessonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "start_time")
    long time;

    @OneToOne
    @JoinColumn(name = "id")
    Group group;

    @OneToOne
    @JoinColumn(name = "id")
    AudienceModel audienceModel;
}
