package com.example.SpringJDBC.repo;

import com.example.SpringJDBC.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentRepo {

    public void save(Student s) {
        System.out.println("Added!");
    }
    public List<Student> findAll(){
        List<Student> students= new ArrayList<>();
        return students;
    }
}
