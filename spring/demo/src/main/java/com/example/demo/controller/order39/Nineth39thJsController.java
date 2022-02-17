package com.example.demo.controller.order39;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/39th/js")
public class Nineth39thJsController {

    // 프로토타입 (prototype) 이란 ?
    // 리턴 타입이 무엇이고
    // 매서드(함수) 이름은 무엇이고
    // 인자로 취하는 것은 무엇인지를 전반적으로 나타냄
    // 그래서 프로토타입을 보고 뭐하는 것이다라는 전반적 유추가 가능해야함
    @GetMapping("/jsBoolTest")
    public String jsBoolTest () {
        log.info("jsBoolTest()");

        return "/39th/js/jsBoolTest";
    }

    @GetMapping("/equalTest")
    public String equalTest () {
        log.info("equalTest()");

        return "/39th/js/equalTest";
    }

    @GetMapping("/equalTest2")
    public String equalTest2 () {
        log.info("equalTest2()");

        return "/39th/js/equalTest2";
    }

    @GetMapping("/spreadTest")
    public String spreadTest () {
        log.info("spreadTest()");

        return "/39th/js/spreadTest";
    }

    @GetMapping("/classTest")
    public String classTest () {
        log.info("classTest()");

        return "/39th/js/classTest";
    }
}
