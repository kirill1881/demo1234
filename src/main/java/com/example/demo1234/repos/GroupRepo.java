package com.example.demo1234.repos;

import com.example.demo1234.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepo extends JpaRepository<Group, Long> {
    Group findByNumber(String number);
}
