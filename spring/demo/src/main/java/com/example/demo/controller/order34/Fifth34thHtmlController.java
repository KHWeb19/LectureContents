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

    @GetMapping("/imgTag")
    public String imgTag () {
        log.info("imgTag");

        return "/34th/html/imgTag";
    }

    @GetMapping("/hpbrTag")
    public String hTag () {
        log.info("hTag");

        return "/34th/html/h_p_br_Tag";
    }

    @GetMapping("/fontExample")
    public String fontExample () {
        log.info("fontExample");

        return "/34th/html/fontExample";
    }

    @GetMapping("/markAndColorExample")
    public String markAndColorExample () {
        log.info("markAndColorExample");

        return "/34th/html/markAndColorExample";
    }

    @GetMapping("/tableExample")
    public String tableExample () {
        log.info("tableExample");

        return "/34th/html/tableExample";
    }

    @GetMapping("/checkBoxExample")
    public String checkBoxExample () {
        log.info("checkBoxExample");

        return "/34th/html/checkBoxExample";
    }

    @GetMapping("/radioBoxExample")
    public String radioBoxExample () {
        log.info("radioBoxExample");

        return "/34th/html/radioBoxExample";
    }

    @GetMapping("/loginFormExample")
    public String loginFormExample () {
        log.info("loginFormExample");

        return "/34th/html/loginFormExample";
    }
}
