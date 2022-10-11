package com.example.ms_course.service;

import com.example.ms_course.dto.StudentDto;
import com.example.ms_course.model.Student;


public interface StudentService {

    Student getById(Long id);

    Student createStudent(Student studentDto);

    Student updateStudent(Long id, Student dto);

    void deleteStudent(Long id);
}
