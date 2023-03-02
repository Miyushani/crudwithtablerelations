package com.example.crud.with.table.relations.repository;

import com.example.crud.with.table.relations.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepo extends JpaRepository<Grade, Integer> {
}
