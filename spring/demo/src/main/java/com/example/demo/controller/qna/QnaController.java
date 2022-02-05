package com.example.demo.controller.qna;

import com.example.demo.entity.qna.StaticProduct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/qna")
public class QnaController {

    @GetMapping("globTest")
    public String[] takeStaticProduct () {
        log.info("takeStaticProduct()");

        return StaticProduct.data;
    }
}
