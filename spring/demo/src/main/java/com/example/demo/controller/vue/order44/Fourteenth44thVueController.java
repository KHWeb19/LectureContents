package com.example.demo.controller.vue.order44;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/44th/vue")
public class Fourteenth44thVueController {

    @GetMapping("/dataBind")
    public String getDataBind () {
        log.info("getDataBind()");

        return "/vue/44th/dataBind";
    }
}
