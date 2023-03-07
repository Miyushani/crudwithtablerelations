package com.example.crud.with.table.relations.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetStuByDto {
    private int gradeNum;
    private String subject;
    private String teachrsName;
    private String letter;
}
