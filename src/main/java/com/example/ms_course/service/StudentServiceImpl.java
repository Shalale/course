package com.example.ms_course.service;

import com.example.ms_course.dto.StudentDto;
import com.example.ms_course.model.Student;
import com.example.ms_course.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Override
    public List<Student> getAllStudents() {

        return new ArrayList<Student>(repository.findAll());
    }

    @Override
    public Student getById(Long id) {
        log.info("get student id={}", id);

        Student student = repository.findById(id).orElseThrow();
        return student;
    }


    @Override
    public Student createStudent(Student student) {
        return repository.save(student);
    }


    @Override
    public Student updateStudent(Long id, Student newStudent){
        log.info("Creating student with id={}", id);

        Student student = repository.findById(id).orElseThrow();

        student.setName(newStudent.getName());
        student.setSurname(newStudent.getSurname());
        student.setAge(newStudent.getAge());

        log.info("creation successful");

        return repository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        log.info("Student id={} is deleting..", id);

        repository.findById(id).orElseThrow();
        repository.deleteById(id);

        log.info("deleted successfully");
    }
}
