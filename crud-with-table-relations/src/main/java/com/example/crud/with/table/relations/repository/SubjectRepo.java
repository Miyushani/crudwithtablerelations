package com.example.crud.with.table.relations.repository;

import com.example.crud.with.table.relations.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject,String> {
}
