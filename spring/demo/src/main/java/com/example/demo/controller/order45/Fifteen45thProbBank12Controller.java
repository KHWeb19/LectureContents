package com.example.demo.controller.order45;

import com.example.demo.entity.order45.Student;
import com.example.demo.service.order45.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/45th/probBank12")
public class Fifteen45thProbBank12Controller {

    @Autowired
    private StudentService studentService;


    @GetMapping("/register")
    public String getProbBank12Register (Student student) {
        log.info("getProbBank12Register()");

        return "/45th/probBank12/register";
    }

    @PostMapping("/register")
    public String probBank12Register (Student student) {
        log.info("probBank12Register()");

        studentService.register(student);

        return "/45th/probBank12/success";
    }

    @GetMapping("/list")
    public String probBank12List (Model model) {
        log.info("probBank12List()");

        model.addAttribute("list", studentService.list());

        return "/45th/probBank12/list";
    }
}
