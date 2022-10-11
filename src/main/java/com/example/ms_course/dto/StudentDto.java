package com.example.ms_course.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class StudentDto {
    private Long id;
    private String name;
    private String surname;
    private int age;
}
