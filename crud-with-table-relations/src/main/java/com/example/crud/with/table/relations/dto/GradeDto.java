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
    private int gradeNum;
    //private List<StudentDto> studentDto;

    private List<SubjectDto> subjectDto;

    private List<TeacherDto> teacherDto;

}

