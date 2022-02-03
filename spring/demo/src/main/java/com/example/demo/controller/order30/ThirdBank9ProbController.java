package com.example.demo.controller.order30;

import com.example.demo.entity.order30.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/30th")
public class ThirdBank9ProbController {

    @GetMapping("/prob")
    public String getBank9Prob () {
        log.info("get getBank9Prob()");

        return "30th/prob/prob";
    }

    @ResponseBody
    @PostMapping("/prob1")
    public Product postBank9Prob1 () {
        log.info("post postBank9Prob1()");

        Product prod = new Product();

        return prod;
    }
}
