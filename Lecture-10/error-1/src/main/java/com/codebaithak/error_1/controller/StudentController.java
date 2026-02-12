package com.codebaithak.error_1.controller;

import com.codebaithak.error_1.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/students")
    public StudentDto getStudents(){
        return new StudentDto(7L, "Sam", "sam@gmail.com");
    }
}
