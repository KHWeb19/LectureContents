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

    @GetMapping("/boxPositioningTest")
    public String boxPositioningTest () {
        log.info("boxPositioningTest()");

        return "/37th/css3/boxPositioningTest";
    }

    @GetMapping("/boxPositioningTest2")
    public String boxPositioningTest2 () {
        log.info("boxPositioningTest2()");

        return "/37th/css3/boxPositioningTest2";
    }

    @GetMapping("/boxLayoutTest")
    public String boxLayoutTest () {
        log.info("boxLayoutTest()");

        return "/37th/css3/boxLayoutTest";
    }

    @GetMapping("/boxBorderTest")
    public String boxBorderTest () {
        log.info("boxBorderTest()");

        return "/37th/css3/boxBorderTest";
    }

    @GetMapping("/boxBorderRoundTest")
    public String boxBorderRoundTest () {
        log.info("boxBorderRoundTest()");

        return "/37th/css3/boxBorderRoundTest";
    }

    @GetMapping("/boxBorderEllipseTest")
    public String boxBorderEllipseTest () {
        log.info("boxBorderEllipseTest()");

        return "/37th/css3/boxBorderEllipseTest";
    }
}
