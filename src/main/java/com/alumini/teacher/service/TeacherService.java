package com.alumini.teacher.service;

import com.alumini.teacher.model.TeacherModel;
import com.alumini.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<TeacherModel> getAllTeachers() {
        List<TeacherModel> teachersList = new ArrayList<>();
        teacherRepository.findAll().forEach(teachersList::add);
        return teachersList;
    }

    public TeacherModel getTeacherById(String id) {
        return teacherRepository.findById(id).get();
    }

    public void addTeacher(TeacherModel teacher) {
        teacherRepository.save(teacher);
    }

    public void updateTeacher(String id, TeacherModel teacher) {
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(String id) {
        teacherRepository.deleteById(id);
    }
}
