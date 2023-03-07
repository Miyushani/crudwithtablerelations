package com.example.crud.with.table.relations.controller;

import com.example.crud.with.table.relations.dto.GetStuByDto;
import com.example.crud.with.table.relations.dto.StudentDto;
import com.example.crud.with.table.relations.service.StudentService;
import com.example.crud.with.table.relations.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
@CrossOrigin
public class SubjectController {
   @Autowired
    private SubjectService subjectService;
    @PostMapping("/filterStudentByName")
    public ResponseEntity<Object> studentDtoByLetter(@RequestBody GetStuByDto getStuByDto){
        return new ResponseEntity<>(subjectService.filterStudByName(getStuByDto),HttpStatus.ACCEPTED);
    }
}
