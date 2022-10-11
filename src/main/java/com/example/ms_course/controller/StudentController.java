package com.example.ms_course.controller;

import com.example.ms_course.dto.StudentDto;
import com.example.ms_course.model.Student;
import com.example.ms_course.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;
    private final ModelMapper mapper;

    @GetMapping
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDto getStudentById(@PathVariable Long id){
        return mapper.map(service.getById(id), StudentDto.class);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public StudentDto createStudent(@RequestBody StudentDto dto){
        Student student = mapper.map(dto, Student.class);

        return mapper.map(service.createStudent(student), StudentDto.class);
    }

    @PutMapping("/{id}")
    public StudentDto updateStudent(@PathVariable Long id, @RequestBody StudentDto dto){
        Student student = mapper.map(dto, Student.class);

        return mapper.map(service.updateStudent(id, student), StudentDto.class);
    }


    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        service.deleteStudent(id);
    }
}
