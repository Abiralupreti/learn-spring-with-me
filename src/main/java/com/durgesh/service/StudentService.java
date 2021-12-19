package com.durgesh.service;

import com.durgesh.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudentById(Long id);
}
