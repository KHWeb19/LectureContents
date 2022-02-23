package com.example.demo.controller.order42;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/42th/arrow")
public class Twelveth42thArrowFunctionController {

    @GetMapping("/jsArrow")
    public String getJsArrow () {
        log.info("getJsArrow()");

        return "/42th/arrow/jsArrow";
    }
}
