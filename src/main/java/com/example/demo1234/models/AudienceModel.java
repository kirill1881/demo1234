package com.example.demo1234.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student_audience1")
public class AudienceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "number")
    String number;

    @Column(name = "number_of_places")
    int places;
}
