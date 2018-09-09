package com.anky.springjdbc.controller;

import com.anky.springjdbc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ankitbhowmick@hotmail.com
 * 10/9/18 12:19 AM
 */
@RestController
public class StudentController {


    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/create")
    public void create() {
        studentRepository.create("Harsh",23);
    }

    @RequestMapping("/ping")
    public String ping() {
        return "Hello World";
    }
}
