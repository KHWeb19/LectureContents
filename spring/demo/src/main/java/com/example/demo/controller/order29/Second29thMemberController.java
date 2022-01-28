package com.example.demo.controller.order29;

import com.example.demo.entity.order29.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/29th/member")
public class Second29thMemberController {

    // 실제로는 아래 코드에서 리턴되는 member는 그냥 객체(메모리 주소)일 뿐인데
    // 웹 상에서 출력되는 정보는 JSON 형태로 출력되었다.
    // 이를 지원하는 녀석은 ResponseBody에 해당한다.
    @ResponseBody
    @GetMapping("/view-info")
    public Member viewInfo () {
        log.info("viewInfo()");

        Member member = new Member();
        log.info("member: " + member);

        return member;
    }
}
