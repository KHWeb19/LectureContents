package com.example.demo.service.order45;

import com.example.demo.entity.order32.Board;
import com.example.demo.entity.order45.Student;

import java.util.List;

public interface StudentService {
    public void register (Student student);
    public List<Student> list ();
}
