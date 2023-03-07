package com.example.crud.with.table.relations.controller;

import com.example.crud.with.table.relations.dto.StudentDto;
import com.example.crud.with.table.relations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/org")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;


    //add student
    @PostMapping("/saveStudent")
    public ResponseEntity<Object>setStudent(@RequestBody StudentDto studentDto)
    {
        studentService.insertStudent(studentDto);
        return new ResponseEntity<>("Successfully Inserted.",HttpStatus.ACCEPTED);
    }

    //get all data
    @GetMapping("/getStudent")
    public ResponseEntity<Object> getAllData()
    {
        return new ResponseEntity<>(studentService.getAllStudent(),HttpStatus.ACCEPTED);
    }
    @PutMapping("/updateStudent/{studentId}")
    public ResponseEntity<Object> updateStudent(@PathVariable int studentId){
        return new ResponseEntity<>("Updated successfully.",HttpStatus.ACCEPTED);
    }
    @GetMapping("/getByStuId/{student_Id}")
    public ResponseEntity<Object> getStudentById(@PathVariable int studentId){
        return new ResponseEntity<> (studentService.getByStudentId(studentId),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/dltById/{student_Id}")
    public ResponseEntity<Object> deleteStudentById(@PathVariable int studentId){
        studentService.deleteByStudentId(studentId);
        return new ResponseEntity<>("Deleted",HttpStatus.ACCEPTED);
    }


}
