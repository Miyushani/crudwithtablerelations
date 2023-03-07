package com.example.crud.with.table.relations.service;

import com.example.crud.with.table.relations.dto.StudentDto;
import com.example.crud.with.table.relations.dto.TeacherDto;
import com.example.crud.with.table.relations.entity.Teacher;
import com.example.crud.with.table.relations.repository.TeacherRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TeacherService {
    @Autowired
    private TeacherRepo teacherRepo;
    @Autowired
    private ModelMapper modelMapper;
    public void insertTeacher(TeacherDto teacherDto)
    {
        teacherRepo.save(modelMapper.map(teacherDto,Teacher.class));
    }

    //get all employee
    public List<TeacherDto> getAllTeachers()
    {
        List<Teacher> teacherList= teacherRepo.findAll();
        return modelMapper.map(teacherList, new TypeToken<ArrayList<TeacherDto>>() {
        }.getType());
    }
    public void updateTeacher(TeacherDto teacherDto)
    {
        teacherRepo.save(modelMapper.map(teacherDto,Teacher.class));
    }
    public TeacherDto getByTeacherId(int teacherId)
    {
        Teacher teacher = teacherRepo.findById(teacherId).orElse(null);
        return modelMapper.map(teacher, TeacherDto.class);
    }
    public void deleteByTeacherId(int teacherId){
        teacherRepo.deleteById(teacherId);
    }
}
