package com.example.demo.controller.jpa.order58;

import com.example.demo.controller.jpa.order58.request.MemberRequest;
import com.example.demo.service.jpa.order58.JpaMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/vueJpaMemberAuth")
@CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*")
public class VueJpaMemberAuthController {

    @Autowired
    private JpaMemberService service;

    @PostMapping("/register")
    public void jpaMemberAuthRegister (@Validated @RequestBody MemberRequest memberRequest) {
        log.info("jpaMemberAuthRegister(): " + memberRequest.getId() + ", " +
                        memberRequest.getPw() + ", " +
                        (memberRequest.getAuth().equals("사업자") ? "ROLE_BUSINESS" : "ROLE_INDIVIDUAL"));

        service.register(memberRequest);
    }
}
