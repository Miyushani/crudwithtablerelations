package com.example.crud.with.table.relations.service;

import com.example.crud.with.table.relations.dto.GetStuByDto;
import com.example.crud.with.table.relations.dto.StudentDto;
import com.example.crud.with.table.relations.entity.Student;
import com.example.crud.with.table.relations.entity.StudentSubject;
import com.example.crud.with.table.relations.entity.Teacher;
import com.example.crud.with.table.relations.repository.StudentRepo;
import com.example.crud.with.table.relations.repository.StudentSubjectRepo;
import com.example.crud.with.table.relations.repository.SubjectRepo;
import com.example.crud.with.table.relations.repository.TeacherRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

@Service
@Transactional
public class SubjectService {
    @Autowired
    private SubjectRepo subjectRepo;
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private TeacherRepo teacherRepo;
    @Autowired
    private StudentSubjectRepo studentSubjectRepo;
    @Autowired
    private ModelMapper modelMapper;
    public List<Student> filterStudByName(GetStuByDto getStuByDto){
            int subjectId= subjectRepo.findAllBySubjectName(getStuByDto.getSubject());
            Optional<List<StudentSubject>> optionalStudentSubjects = studentSubjectRepo.findAllBySubjectId(subjectId);
            List<Integer> studentIdList = new ArrayList<>();
            if(optionalStudentSubjects.isPresent()) {
                studentIdList = optionalStudentSubjects.get().parallelStream().map(StudentSubject::getStudentId).collect(Collectors.toList());
            }

            Optional<List<Student>> studentList = studentRepo.findAllByNameIsStartingWithAndGradeIdAndStudentIdIn(getStuByDto.getLetter(),getStuByDto.getGradeNum(), studentIdList);
        return modelMapper.map(studentList, new TypeToken<ArrayList<StudentDto>>() {
        }.getType());
            //Optional List<Teacher>> teacherList= teacherRepo.findAllByTeachersName(getStuByDto.getTeachrsName());

    }
}
