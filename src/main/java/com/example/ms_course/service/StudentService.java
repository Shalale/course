package com.example.ms_course.service;

import com.example.ms_course.dto.StudentRequest;
import com.example.ms_course.dto.StudentResponse;
import com.example.ms_course.model.Student;

import java.util.List;


public interface StudentService {

    List<StudentResponse> getAllStudents();
    StudentResponse getById(Long id);

    List<StudentResponse> findByName(String name);

    StudentResponse createStudent(StudentRequest request);

    StudentResponse updateStudent(Long id, StudentRequest request);

    void deleteStudent(Long id);
}
