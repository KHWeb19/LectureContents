package com.example.demo.controller.jpa.order63;

import com.example.demo.controller.jpa.order58.request.MemberRequest;
import com.example.demo.controller.jpa.order63.response.JpaMemberBothResponse;
import com.example.demo.entity.jpa.JpaMemberBoth;
import com.example.demo.entity.jpa.VueJpaMemberWithAuth;
import com.example.demo.service.jpa.order63.JpaBmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
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
    public List<JpaMemberBothResponse> checkBusinessMember () {
        log.info("checkBusiness() ===> findBusinessMember!!!");

        List<JpaMemberBoth> businessMember = service.findBusiness();
        List<JpaMemberBothResponse> responses = new ArrayList<>();

        for (JpaMemberBoth member : businessMember) {
            responses.add(new JpaMemberBothResponse(member.getUserId()));
        }

        return responses;
    }
}
