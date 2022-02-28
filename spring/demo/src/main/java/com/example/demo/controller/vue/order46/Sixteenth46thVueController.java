package com.example.demo.controller.vue.order46;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/46th/rpg")
public class Sixteenth46thVueController {

    @GetMapping("/tactics")
    public String getTactics () {
        log.info("getTactics()");

        return "/vue/46th/tactics";
    }
}
