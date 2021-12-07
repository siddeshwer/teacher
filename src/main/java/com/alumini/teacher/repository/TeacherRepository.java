package com.alumini.teacher.repository;

import com.alumini.teacher.model.TeacherModel;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<TeacherModel,String> {
}
