package com.example.crud.with.table.relations.service;

import com.example.crud.with.table.relations.dto.StudentDto;
import com.example.crud.with.table.relations.repository.StudentRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;
    // insert employee
    public void insertStudent(StudentDto studentDto)
    {
        studentRepo.save(modelMapper.map(studentDto,Student.class));
    }

    //get all employee
    public List<StudentDto> getAllStudent()
    {
        List<Student> studentList= studentRepo.findAll();
        return modelMapper.map(studentList, new TypeToken<ArrayList<StudentDto>>() {
        }.getType());
    }
    public void updateStudent(StudentDto studentDto)
    {
        studentRepo.save(modelMapper.map(studentDto,Student.class));
    }
    public StudentDto getByStudentId(int studentId)
    {
        Student student = studentRepo.findById(studentId).orElse(null);
        return modelMapper.map(student, StudentDto.class);
    }
    public void deleteByStudentId(int studentId){
        studentRepo.deleteById(studentId);
    }
}


