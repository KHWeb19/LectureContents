package com.example.demo.controller.order38;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/38th/ncvue")
public class Eighth38thNonCliVueController {

    @GetMapping("/vue-index")
    public String index () {
        log.info("index()");

        return "/38th/ncvue/index";
    }
}
