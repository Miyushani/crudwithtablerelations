package com.example.crud.with.table.relations.entity;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

public class Subject {
    @Id
    private String subjectId;
    private String subjectName;
    @ManyToMany(mappedBy="subject")
    List<Grade> gradeList;
}
