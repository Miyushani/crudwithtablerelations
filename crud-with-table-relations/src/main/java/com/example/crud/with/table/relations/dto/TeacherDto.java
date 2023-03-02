package com.example.crud.with.table.relations.dto;

import com.example.crud.with.table.relations.entity.Grade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {
    private int teachersId;
    private String teachersName;
    private String teachersAddress;
    private String teachersMail;
    Grade grade;
}
