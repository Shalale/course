package com.example.ms_course.dto;

import lombok.Data;

@Data
public class StudentRequest {
    private Long id;
    private String name;
    private String surname;
    private int age;
}
