package com.example.ms_course.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private int age;
}
