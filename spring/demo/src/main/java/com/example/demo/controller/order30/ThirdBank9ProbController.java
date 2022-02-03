package com.example.demo.controller.order30;

import com.example.demo.entity.order30.EddiLotto;
import com.example.demo.entity.order30.Product;
import com.example.demo.entity.order30.response.LottoResponse;
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

    @ResponseBody
    @PostMapping("/prob2")
    public LottoResponse postBank9Prob2 () {
        log.info ("post postBank9Prob2()");

        EddiLotto el = new EddiLotto(100, 5);
        el.raffle();

        LottoResponse lr = new LottoResponse(el);

        return lr;
    }
}
