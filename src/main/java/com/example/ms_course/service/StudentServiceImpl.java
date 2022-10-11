package com.example.ms_course.service;

import com.example.ms_course.dto.StudentDto;
import com.example.ms_course.model.Student;
import com.example.ms_course.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    private final ModelMapper mapper;

//    @Override
//    public StudentDto getById(Long id) {
//        Student student = repository.findById(id);
//        return mapper.map(student, StudentDto.class);
//    }


//    @Override
//    public StudentDto createStudent(StudentDto studentDto) {
//        Student student = mapper.map(studentDto, Student.class);
//        repository.save(student);
//        return studentDto;
//    }

    @Override
    public StudentDto createStudent(StudentDto studentDto) {

        return studentDto;
    }

//    @Override
//    public StudentDto updateStudent(Long id, StudentDto dto){
//        Student student = repository.findById(id).orElseThrow();
//
//        student.setName(dto.getName());
//        student.setSurname(dto.getSurname());
//        student.setAge(dto.getAge());
//
//        repository.save(student);
//        return mapper.map(student, StudentDto.class);
//    }
//
//    @Override
//    public void deleteStudent(Long id) {
//        repository.findById(id).orElseThrow();
//        repository.deleteById(id);
//    }
}
