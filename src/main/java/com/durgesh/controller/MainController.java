package com.durgesh.controller;

import com.durgesh.entity.Student;
import com.durgesh.repo.StudentRepo;
import com.durgesh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController@RequestMapping("/home/v1")
public class MainController {


    private StudentService studentService;

    public MainController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/all-student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("/add-student")
    public Student addStudet(Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/get-student-id/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/delete-student-id/{id}")
    public void deleteStudentById(@PathVariable Long id){
         studentService.deleteStudentById(id);
    }



}
