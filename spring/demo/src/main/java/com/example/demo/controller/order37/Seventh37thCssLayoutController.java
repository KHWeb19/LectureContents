package com.example.demo.controller.order37;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/37th/layout")
public class Seventh37thCssLayoutController {

    @GetMapping("/boxSizingTest")
    public String boxSizingTest() {
        log.info("boxSizingTest()");

        return "/37th/css3/boxSizingTest";
    }
}
