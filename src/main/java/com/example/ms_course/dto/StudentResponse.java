package com.example.ms_course.dto;

import lombok.Data;

@Data
public class StudentResponse {
    private Long id;
    private String name;
    private String surname;
    private int age;
}
