package com.durgesh.controller;

import com.durgesh.entity.Student;
import com.durgesh.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home/v1")
public class MainController {

    @Autowired
    private StudentRepo studentRepo;

    @RequestMapping("/all-student")
    public List<Student> getAllStudent(){

        return studentRepo.findAll();
    }


}
