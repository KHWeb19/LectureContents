package com.example.demo.controller.order30;

import com.example.demo.entity.order30.probBank.EddiLotto;
import com.example.demo.entity.order30.probBank.Product;
import com.example.demo.entity.order30.probBank.RegularPolygon;
import com.example.demo.entity.order30.probBank.response.LottoResponse;
import com.example.demo.entity.order30.probBank.response.PolygonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

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

    @ResponseBody
    @PostMapping("/prob3tri")
    public PolygonResponse postBank9Prob3Triangle () {
        log.info ("post postBank9Prob3Triangle()");

        //RegularPolygon rp = new RegularPolygon(2.0f * (float) Math.sqrt(Math.sqrt(3.0f)));
        RegularPolygon rp = new RegularPolygon(2.0f * (float) Math.pow(3.0f, 0.25f));
        rp.calcTriangleArea();

        PolygonResponse pr = new PolygonResponse(rp);

        return pr;
    }

    @ResponseBody
    @PostMapping("/prob3rect")
    public PolygonResponse postBank9Prob3Rectangle () {
        log.info ("post postBank9Prob3Rectangle()");

        RegularPolygon rp = new RegularPolygon(1);
        rp.calcRectangleArea();

        PolygonResponse pr = new PolygonResponse(rp);

        return pr;
    }

    @ResponseBody
    @PostMapping("/prob3hexa")
    public PolygonResponse postBank9Prob3Hexagon () {
        log.info ("post postBank9Prob3Hexagon()");

        RegularPolygon rp = new RegularPolygon(2.0f * (float) Math.sqrt(3.0f));
        rp.calcHexagonArea();

        PolygonResponse pr = new PolygonResponse(rp);

        return pr;
    }
}
