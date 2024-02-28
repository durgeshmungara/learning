package com.springApp.controller;

import com.springApp.model.Student;
import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @GetMapping("/v1/student-details")
    public String studentDetails() {
        return "Hello World!";
    }
}
