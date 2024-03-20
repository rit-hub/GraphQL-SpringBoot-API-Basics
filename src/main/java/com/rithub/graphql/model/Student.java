package com.rithub.graphql.model;

import com.rithub.graphql.enums.Subject;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        @Column(name = "subjects")
        private String subjects;
        @Column(name = "name")
        private String name;

}
