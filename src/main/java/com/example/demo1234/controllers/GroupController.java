package com.example.demo1234.controllers;

import com.example.demo1234.models.Group;
import com.example.demo1234.repos.GroupRepo;
import com.example.demo1234.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    GroupRepo groupRepo;

    @Autowired
    GroupService groupService;

    @GetMapping("/getAll")
    public List<Group> getAllGroups(){
        return groupRepo.findAll();
    }

    @GetMapping("/create/{groupNumber}/{gradeNumber}")
    public void createGroup(@PathVariable int groupNumber,
                            @PathVariable int gradeNumber){
        groupService.saveGroup(groupNumber, gradeNumber);
    }
}
