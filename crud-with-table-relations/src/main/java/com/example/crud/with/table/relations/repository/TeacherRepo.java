package com.example.crud.with.table.relations.repository;

import com.example.crud.with.table.relations.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
    Optional<List<Teacher>> findAllByTeachersName(String string);
}
