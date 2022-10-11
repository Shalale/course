package com.example.ms_course.service;

import com.example.ms_course.dto.StudentDto;


public interface StudentService {

    StudentDto getById(Long id);

    StudentDto createStudent(StudentDto studentDto);

    StudentDto updateStudent(Long id, StudentDto dto);

    void deleteStudent(Long id);
}
