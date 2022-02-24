package com.example.demo.controller.order43;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/43th/promise")
public class Thirteenth43thJsPromiseController {

    @GetMapping("/one")
    public String getPromiseOne () {
        log.info("getPromiseOne()");

        return "/43th/promise/one";
    }

    @GetMapping("/two")
    public String getPromiseTwo () {
        log.info("getPromiseTwo()");

        return "/43th/promise/two";
    }

    @GetMapping("/three")
    public String getPromiseThree () {
        log.info("getPromiseThree()");

        return "/43th/promise/three";
    }

    @GetMapping("/four")
    public String getPromiseFour () {
        log.info("getPromiseFour()");

        return "/43th/promise/four";
    }

    @GetMapping("/five")
    public String getPromiseFive () {
        log.info("getPromiseFive()");

        return "/43th/promise/five";
    }

    @GetMapping("/six")
    public String getPromiseSix () {
        log.info("getPromiseSix()");

        return "/43th/promise/six";
    }
}
