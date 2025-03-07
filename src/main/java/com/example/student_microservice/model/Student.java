package com.example.student_microservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "STUDENTS")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentid;
    private String firstName;
    private String lastName;
    private String email;
}
