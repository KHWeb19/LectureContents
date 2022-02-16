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

    @GetMapping("/dataTypeCheck")
    public String dataTypeCheck () {
        log.info("dataTypeCheck()");

        return "/38th/ncvue/dataTypeCheck";
    }

    @GetMapping("/jsDataTypeCheck")
    public String jsDataTypeCheck () {
        log.info("jsDataTypeCheck()");

        return "/38th/ncvue/jsDataTypeCheck";
    }

    @GetMapping("/doNotUseVar")
    public String doNotUseVar () {
        log.info("doNotUseVar()");

        return "/38th/ncvue/doNotUseVar";
    }

    @GetMapping("/jsArrowStyle")
    public String jsArrowStyle () {
        log.info("jsArrowStyle()");

        return "/38th/ncvue/jsArrowStyle";
    }
}
