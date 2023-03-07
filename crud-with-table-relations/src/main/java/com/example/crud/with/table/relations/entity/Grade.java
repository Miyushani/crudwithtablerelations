package com.example.crud.with.table.relations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Grade {
    @Id
    private int gradeNumber;
    //@OneToMany(cascade= CascadeType.ALL,mappedBy="grade")
    //private List<Student> student;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Subject> subject;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Teacher> teacher;
}
