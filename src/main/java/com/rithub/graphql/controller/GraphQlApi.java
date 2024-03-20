package com.rithub.graphql.controller;

import com.rithub.graphql.model.Student;
import com.rithub.graphql.service.GraphQlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQlApi {

    @Autowired
    GraphQlService graphQlService;

    @QueryMapping(name = "hello")
    public String getHello() {
        return "Hello World";
    }

    @QueryMapping(name = "getAllStudents")
    public List<Student> getAllStudents(){
        return graphQlService.getAllStudents();
    }

    @MutationMapping(name = "saveStudent")
    public String getAllStudents(@Argument(name = "student") Student student){
        return graphQlService.createStudent(student);
    }
}
