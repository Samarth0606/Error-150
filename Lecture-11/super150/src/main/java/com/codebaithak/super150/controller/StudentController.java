package com.codebaithak.super150.controller;

import com.codebaithak.super150.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students")
    public StudentDto allstudents(){
        return new StudentDto(6L, "nelu", "nelu@gmail.com");
    }
}
