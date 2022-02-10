package com.example.demo.controller.order34;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/34th/html")
public class Fifth34thHtmlController {

    @GetMapping("/liTag")
    public String liTag () {
        log.info("liTag");

        return "/34th/html/liTag";
    }
}
