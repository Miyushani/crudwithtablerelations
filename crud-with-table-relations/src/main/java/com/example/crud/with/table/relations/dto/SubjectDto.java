package com.example.crud.with.table.relations.dto;

import com.example.crud.with.table.relations.entity.Grade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDto {
    private int subjectId;
    private String subjectName;
    GradeDto gradeDto;
}
