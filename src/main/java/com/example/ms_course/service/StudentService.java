package com.example.ms_course.service;

import com.example.ms_course.dto.StudentDto;
import com.example.ms_course.model.Student;

import java.util.List;


public interface StudentService {

    List<Student> getAllStudents();
    Student getById(Long id);

    Student createStudent(Student studentDto);

    Student updateStudent(Long id, Student dto);

    void deleteStudent(Long id);
}
