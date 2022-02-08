package com.example.demo.controller.qna;

import com.example.demo.entity.order29.Member;
import com.example.demo.entity.qna.StaticProduct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/qna")
public class QnaController {

    @GetMapping("globTest")
    public String[] takeStaticProduct () {
        log.info("takeStaticProduct()");

        return StaticProduct.data;
    }

    @GetMapping("doubleMapTest")
    public Map<String, Member> doubleMapTest () {
        log.info("doubleMapTest()");

        Map<String, Member> map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            Member member = new Member();
            map.put("key" + i, member);
        }

        for (Map.Entry<String, Member> each : map.entrySet()) {
            String key = each.getKey();
            Member value = each.getValue();
            log.info("key = " + key + ", value = " + value);
        }

        return map;
    }
}
