package com.example.crud.with.table.relations.repository;

import com.example.crud.with.table.relations.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
}
