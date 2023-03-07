package com.example.crud.with.table.relations.controller;

import com.example.crud.with.table.relations.dto.StudentDto;
import com.example.crud.with.table.relations.dto.TeacherDto;
import com.example.crud.with.table.relations.entity.Teacher;
import com.example.crud.with.table.relations.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Teacher")
@CrossOrigin
public class TeacherController {
    @Autowired
    public TeacherService teacherService;
    @PostMapping("/saveTeacher")
    public void addTeacher(@RequestBody TeacherDto teacherDto)
    {
        teacherService.insertTeacher(teacherDto);
    }

    //get all data
    @GetMapping("/getTeachers")
    public List<TeacherDto> getAllData()
    {
        return teacherService.getAllTeachers();
    }
    @PutMapping("/updateTeacher")
    public void updateStudent(@RequestBody TeacherDto teacherDto){
        teacherService.updateTeacher(teacherDto);
    }
    @GetMapping("/getByTeacId/{teacher_Id}")
    public TeacherDto getTeacherById(@PathVariable int teacherId){
        return teacherService.getByTeacherId(teacherId);
    }
    @DeleteMapping("/dltById/{teacher_Id}")
    public String deleteTeacherById(@PathVariable int teacherId){
        teacherService.deleteByTeacherId(teacherId);
        return "Deleted";
    }

}
