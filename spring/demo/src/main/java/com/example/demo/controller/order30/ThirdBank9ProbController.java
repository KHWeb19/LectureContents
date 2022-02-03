package com.example.demo.controller.order30;

import com.example.demo.entity.order30.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/30th")
public class ThirdBank9ProbController {

    @GetMapping("/prob1")
    public Product getBank9Prob1 () {
        log.info("getBank9Prob1()");

        Product prod = new Product();

        return prod;
    }
}
