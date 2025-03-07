package com.example.student_microservice.service;

import com.example.student_microservice.model.Student;
import com.example.student_microservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student creaStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }

    public Optional<Student> getStudentByStudentId(String studentid){
        return studentRepository.findByStudentid(studentid);
    }

    public boolean deleteStudent(Long id){
        if (studentRepository.existsById(id)){
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }
 }
