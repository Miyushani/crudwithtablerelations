package com.example.crud.with.table.relations.controller;

import com.example.crud.with.table.relations.dto.StudentDto;
import com.example.crud.with.table.relations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void addStudent(@RequestBody StudentDto studentDto)
    {
        studentService.insertStudent(studentDto);
    }

    //get all data
    @GetMapping("/getStudent")
    public List<StudentDto> getAllData()
    {
        return studentService.getAllStudent();
    }
    @PutMapping("/updateStudent")
    public void updateStudent(@RequestBody StudentDto studentDto){
        studentService.updateStudent(studentDto);
    }
    @GetMapping("/getByStuId/{student_Id}")
    public StudentDto getStudentById(@PathVariable int studentId){
        return studentService.getByStudentId(studentId);
    }
    @DeleteMapping("/dltById/{student_Id}")
    public String deleteStudentById(@PathVariable int studentId){
        studentService.deleteByStudentId(studentId);
        return "Deleted";
    }


}
