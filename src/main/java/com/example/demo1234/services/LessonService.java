package com.example.demo1234.services;

import com.example.demo1234.models.AudienceModel;
import com.example.demo1234.models.Group;
import com.example.demo1234.models.LessonModel;
import com.example.demo1234.models.helpers.GradeEnum;
import com.example.demo1234.repos.AudienceRepo;
import com.example.demo1234.repos.GroupRepo;
import com.example.demo1234.repos.LessonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

    @Autowired
    LessonRepo lessonRepo;

    @Autowired
    GroupRepo groupRepo;

    @Autowired
    AudienceRepo audienceRepo;

    public void createLesson(long time, int groupNumber,
                             int gradeNumber, String audience){
        LessonModel lessonModel = new LessonModel();
        lessonModel.setTime(time);

        Group group = groupRepo.findByNumberAndGrade_GradeEnum(groupNumber,
                GradeEnum.values()[gradeNumber-1]);

        lessonModel.setGroup(group);

        AudienceModel audienceModel =  new AudienceModel();
        audienceModel = audienceRepo.findByNumber(audience);

        lessonModel.setAudienceModel(audienceModel);

        lessonRepo.save(lessonModel);
    }
}
