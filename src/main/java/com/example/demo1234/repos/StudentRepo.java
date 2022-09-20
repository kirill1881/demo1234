package com.example.demo1234.repos;

import com.example.demo1234.models.StudentModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentModel, Long> {
}
