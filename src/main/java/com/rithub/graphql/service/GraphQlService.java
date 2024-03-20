package com.rithub.graphql.service;

import com.rithub.graphql.model.Student;

import java.util.List;

public interface GraphQlService {

    List<Student> getAllStudents();

    Student getByStudentId(Integer id);

    String createStudent(Student student);
}
