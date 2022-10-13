package com.example.ms_course.service;

import com.example.ms_course.dto.StudentRequest;
import com.example.ms_course.dto.StudentResponse;
import com.example.ms_course.model.Student;
import com.example.ms_course.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<StudentResponse> getAllStudents() {
        return repository.findAll().stream()
                .map(student -> (mapper.map(student, StudentResponse.class))).collect(Collectors.toList());
    }

    @Override
    public StudentResponse getById(Long id) {
        log.info("ActionLog.getStudent.start id:{}", id);

        var student = fetchStudentIfExist(id);

        log.info("ActionLog.getStudent.success id:{}", id);
        return mapper.map(student, StudentResponse.class);
    }

    @Override
    public List<StudentResponse> findByName(String name) {
        log.info("ActionLog.getStudentByName.started name:{}", name);

        return repository.findAllByName(name).stream()
                .map(student -> (mapper.map(student, StudentResponse.class))).collect(Collectors.toList());
    }

    @Override
    public StudentResponse createStudent(StudentRequest request) {
        log.info("ActionLog.createStudent.start");

        var student = mapper.map(request, Student.class);
        repository.save(student);

        return mapper.map(student,StudentResponse.class);
    }

    @Override
    public StudentResponse updateStudent(Long id, StudentRequest request) {
        log.info("ActionLog.updateStudent.start id:{}", id);

        Student student = fetchStudentIfExist(id);

        student.setSurname(request.getSurname());
        student.setName(request.getName());
        student.setAge(request.getAge());

        repository.save(student);
        return mapper.map(student,StudentResponse.class);
    }

    @Override
    public void deleteStudent(Long id) {
        log.info("ActionLog.deleteStudent.start id:{}", id);
        fetchStudentIfExist(id);
        repository.deleteById(id);
        log.info("ActionLog.deleteStudent.start id:{}", id);
    }

    private Student fetchStudentIfExist(Long id) {
        return repository.findById(id).orElseThrow(() -> {
            log.error("ActionLog.deleteStudent.error id:{}", id);
            return new RuntimeException("STUDENT_NOT_FOUND");
        });
    }

}
