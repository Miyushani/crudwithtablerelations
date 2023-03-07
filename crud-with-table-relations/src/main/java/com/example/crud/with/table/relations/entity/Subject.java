package com.example.crud.with.table.relations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Subject {
    @Id
    private int subjectId;
    private String subjectName;
    @ManyToMany(mappedBy="subject")
    List<Grade> gradeList;
}
