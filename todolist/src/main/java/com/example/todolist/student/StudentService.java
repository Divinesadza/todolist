package com.example.todolist.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Divine",
                        "Dzindikwa",
                        LocalDate.now(),
                        "natswadivine@gmail.com",
                        34
                ),

                new Student(
                        "babe",
                        "Matonhodze",
                        LocalDate.now(),
                        "natswadivine@gmail.com",
                        35
                )
        );
    }
}
