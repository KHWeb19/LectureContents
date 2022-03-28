package com.example.demo.controller.jpa.order63;

import com.example.demo.controller.jpa.order58.request.MemberRequest;
import com.example.demo.entity.jpa.JpaMemberBoth;
import com.example.demo.entity.jpa.VueJpaMemberWithAuth;
import com.example.demo.service.jpa.order63.JpaBmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/63th/jpaMember")
@CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*")
public class JpaBusinessMemberCheckController {

    @Autowired
    private JpaBmService service;

    @PostMapping("/register")
    public void jpaMemberAuthRegister (@Validated @RequestBody MemberRequest memberRequest) {
        log.info("jpaMemberAuthRegister(): " + memberRequest.getId() + ", " +
                memberRequest.getPw() + ", " +
                (memberRequest.getAuth().equals("사업자") ? "ROLE_BUSINESS" : "ROLE_INDIVIDUAL"));

        service.register(memberRequest);
    }

    @GetMapping("/checkBusiness")
    public List<JpaMemberBoth> checkBusinessMember () {
        log.info("checkBusiness() ===> findBusinessMember!!!");

        List<JpaMemberBoth> businessMember = service.findBusiness();

        return null;
    }
}
