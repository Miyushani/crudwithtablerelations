package com.example.crud.with.table.relations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class StudentSubject {
    @Id
    private int id;
    private int studentId;
    private int subjectId;

}
