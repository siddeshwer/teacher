package com.alumini.teacher.controller;

import com.alumini.teacher.model.TeacherModel;
import com.alumini.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacher")
    public List<TeacherModel> getTeacher() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/teacher/{id}")
    public TeacherModel getTeacherById(@PathVariable String id) {
        return teacherService.getTeacherById(id);
    }

    @DeleteMapping("/teacher/{id}")
    public void deleteTeacherById(@PathVariable String id) {
        teacherService.deleteTeacher(id);
    }

    @PostMapping("/teacher/add")
    public String createTeacher(@RequestBody TeacherModel teacher) {
        teacherService.addTeacher(teacher);
        return teacher.getId();
    }

    @PutMapping("/teacher/{id}")
    public TeacherModel updateTeacher(@PathVariable String id, @RequestBody TeacherModel teacher) {
        teacherService.updateTeacher(id, teacher);
        return teacher;
    }
}
