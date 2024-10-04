package com.practice.demo.controller;

import com.practice.demo.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    public List<Student> students = Arrays.asList(
            new Student("A", 45), new Student("b", 56)
    );

    private List<Student> studentList = new ArrayList<>(List.of(new Student("A", 45), new Student("b", 56)));

    @GetMapping("/student")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        studentList.add(student);
        return student;
    }

}
