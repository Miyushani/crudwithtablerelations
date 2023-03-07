package com.example.crud.with.table.relations.repository;

import com.example.crud.with.table.relations.entity.StudentTeacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentTeacherRepo extends JpaRepository<StudentTeacher,Integer> {

}
