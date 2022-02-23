package com.example.demo.controller.order42;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/42th/collection")
public class Twelveth42thJsCollectionController {

    @GetMapping("/mapTest")
    public String getMapTest () {
        log.info("getMapTest()");

        return "/42th/collection/mapTest";
    }

    @GetMapping("/setTest")
    public String getSetTest () {
        log.info("getSetTest()");

        return "/42th/collection/setTest";
    }
}
