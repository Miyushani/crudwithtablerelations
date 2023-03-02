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
@Table(name="Teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teachersId;
    private String teachersName;
    private String teachersAddress;
    private String teachersMail;
    @ManyToMany(mappedBy = "teacher")
    List<Grade> gradeList;
}
