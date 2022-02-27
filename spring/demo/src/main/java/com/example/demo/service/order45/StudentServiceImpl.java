package com.example.demo.service.order45;

import com.example.demo.entity.order32.Board;
import com.example.demo.entity.order45.Student;
import com.example.demo.repository.order32.BoardRepository;
import com.example.demo.repository.order45.StudentRepository;
import com.example.demo.service.order32.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository;

    @Override
    public void register(Student student) {
        repository.create(student);
    }

    @Override
    public List<Student> list() {
        List<Student> list = repository.list();
        int mean;

        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            Student studentElem = list.get(i);
            mean = (studentElem.getKorean() + studentElem.getEnglish() + studentElem.getMath() + studentElem.getScience()) / 4;
            studentElem.setMean(mean);
            list.set(i, studentElem);
        }

        return list;
    }
}
