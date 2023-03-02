package com.example.crud.with.table.relations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String name;
    private String address;
    private String email;
    private int age;
    @ManyToOne()
    @JoinColumn(name="studentId", referencedColumnName = "studentId")
    Grade grade;
}
