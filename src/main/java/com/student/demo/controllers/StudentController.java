package com.student.demo.controllers;


import com.student.demo.models.Student;
import com.student.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/createStudent")
    public void createStudent(@RequestBody Student student){
        studentRepository.save(student);
    }

    @GetMapping("/getStudent")
    public Optional<Student> getStudent(@RequestParam("id") Long id) {
        return studentRepository.findById(id);
    }
}
