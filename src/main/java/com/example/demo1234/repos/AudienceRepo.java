package com.example.demo1234.repos;

import com.example.demo1234.models.AudienceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudienceRepo extends JpaRepository<AudienceModel, Long> {
}
