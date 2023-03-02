package com.example.crud.with.table.relations.dto;
import com.example.crud.with.table.relations.entity.Grade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private int studentId;
    private String name;
    private String address;
    private String email;
    private int age;
    private Grade grade;
}
