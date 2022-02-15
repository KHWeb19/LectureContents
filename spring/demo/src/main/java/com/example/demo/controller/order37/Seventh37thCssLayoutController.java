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

    @GetMapping("/cssElementSelectorTest")
    public String cssElementSelectorTest () {
        log.info("cssElementSelectorTest()");

        return "/37th/css3/cssElementSelectorTest";
    }

    @GetMapping("/cssElementSelectorTest2")
    public String cssElementSelectorTest2 () {
        log.info("cssElementSelectorTest2()");

        return "/37th/css3/cssElementSelectorTest2";
    }

    @GetMapping("/cssElementSelectorTest3")
    public String cssElementSelectorTest3 () {
        log.info("cssElementSelectorTest3()");

        return "/37th/css3/cssElementSelectorTest3";
    }

    @GetMapping("/cssElementSelectorTest4")
    public String cssElementSelectorTest4 () {
        log.info("cssElementSelectorTest4()");

        return "/37th/css3/cssElementSelectorTest4";
    }

    @GetMapping("/cssElementSelectorTest5")
    public String cssElementSelectorTest5 () {
        log.info("cssElementSelectorTest5()");

        return "/37th/css3/cssElementSelectorTest5";
    }
}
