package com.example.crud.with.table.relations.dto;

import com.example.crud.with.table.relations.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GradeDto {
    private int grade;
    private List<Student> student;

    private List<Subject> subject;

    private List<Teacher> teacher;

}

