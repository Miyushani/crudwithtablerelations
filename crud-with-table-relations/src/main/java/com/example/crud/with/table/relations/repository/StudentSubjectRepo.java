package com.example.crud.with.table.relations.repository;

import com.example.crud.with.table.relations.entity.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentSubjectRepo extends JpaRepository<StudentSubject,Integer> {
    Optional<List<StudentSubject>> findAllBySubjectId(Integer integer);
}
