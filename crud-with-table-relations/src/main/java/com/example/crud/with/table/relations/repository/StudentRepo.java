package com.example.crud.with.table.relations.repository;

import com.example.crud.with.table.relations.dto.StudentDto;
import com.example.crud.with.table.relations.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    Optional<List<Student>> findAllByNameIsStartingWithAndGradeId(String a, int gradeId);
    Optional<List<Student>> findAllByNameIsStartingWithAndGradeIdAndStudentIdIn(String a, int gradeId, List<Integer> studentIdList);
}
