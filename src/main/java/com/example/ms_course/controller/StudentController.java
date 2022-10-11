package com.example.ms_course.controller;

import com.example.ms_course.dto.StudentDto;
import com.example.ms_course.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

//    @GetMapping("/{id}")
//    public StudentDto getStudentById(@PathVariable Long id){
//        return service.getById(id);
//    }
    @GetMapping
    public String getStudentById(){
        return "Salam Millet";
    }
//
//    @PostMapping
//    public StudentDto createStudent(@RequestBody StudentDto dto){
//        return service.createStudent(dto);
//    }
//
//    @PutMapping("/{id}")
//    public StudentDto updateStudent(@PathVariable Long id, @RequestBody StudentDto dto){
//        return service.updateStudent(id, dto);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable Long id){
//        service.deleteStudent(id);
//    }
//



}
