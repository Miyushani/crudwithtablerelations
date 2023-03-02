package com.example.crud.with.table.relations.repository;

import com.example.crud.with.table.relations.dto.StudentDto;
import com.example.crud.with.table.relations.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
