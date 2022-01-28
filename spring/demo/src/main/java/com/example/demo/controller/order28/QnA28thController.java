package com.example.demo.controller.order28;

import com.example.demo.qna.Student;

import com.example.demo.qna.Student2;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;

@Slf4j
@Controller
@RequestMapping("/qna28th")
public class QnA28thController {

    Scanner scan = new Scanner(System.in);

    @RequestMapping("/homework4")
    public String bank8Homework1 (Model model) {
        log.info(" 8-2 check");

        Student std = new Student();
        std.initAverage();
        model.addAttribute("classMean", std.getAverage());
        return "28th/homework4";
    }

    @RequestMapping("homework4_2")
    public String bank8Homework4_2 (Model model) {
        log.info("4-2 check");

        Student2 student = new Student2();
        student.score();
        student.average();

        model.addAttribute("stuscore", student.score());
        model.addAttribute("average", student.average());

        return "28th/homework4";
    }
}
