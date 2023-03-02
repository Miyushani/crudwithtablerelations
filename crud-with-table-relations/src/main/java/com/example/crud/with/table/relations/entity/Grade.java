package com.example.crud.with.table.relations.entity;

import javax.persistence.*;
import java.util.List;

public class Grade {
    @Id
    private int grade;
    @OneToMany(cascade= CascadeType.ALL,mappedBy="grade")
    private List<Student> student;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Subject> subject;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Teacher> teacher;
}
