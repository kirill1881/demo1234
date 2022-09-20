package com.example.demo1234.repos;

import com.example.demo1234.models.LessonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepo extends JpaRepository<LessonModel, Long> {

}
