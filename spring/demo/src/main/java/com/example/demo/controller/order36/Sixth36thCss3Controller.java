package com.example.demo.controller.order36;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/36th/css3")
public class Sixth36thCss3Controller {

    @GetMapping("/fontColorTest")
    public String fontColorTest () {
        log.info("fontColorTest()");

        return "/36th/css3/fontColorTest";
    }
}
