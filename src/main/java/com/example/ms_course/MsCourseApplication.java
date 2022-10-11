package com.example.ms_course;

import com.example.ms_course.dto.StudentDto;
import com.example.ms_course.model.Student;
import com.example.ms_course.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class MsCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCourseApplication.class, args);
    }

}
