package com.rithub.graphql.service.impl;

import com.rithub.graphql.model.Student;
import com.rithub.graphql.repository.StudentRepository;
import com.rithub.graphql.service.GraphQlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class GraphQlServiceImpl implements GraphQlService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getByStudentId(Integer id) {
        return studentRepository.getReferenceById(id);
    }

    @Override
    public String createStudent(Student student) {
        Student save = studentRepository.save(student);
        return "Student created successfully with id - " + save.getId();
    }
}
