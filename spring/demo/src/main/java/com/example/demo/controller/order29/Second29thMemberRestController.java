package com.example.demo.controller.order29;

import com.example.demo.entity.order29.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
RestController: 데이터 전송이 많은 경우 많이 활용함 (알아서 JSON 처리함)
Controller: 실제 HTML로 페이지를 넘겨줘야할 경우 많이 활용함
 */
@Slf4j
@RestController
@RequestMapping("/29th/member-rest")
public class Second29thMemberRestController {

    @GetMapping("/view-info")
    public Member viewInfo () {
        log.info("viewInfo()");

        Member member = new Member();
        log.info("member: " + member);

        return member;
    }

    @GetMapping("/member-list")
    public List<Member> viewMemberListInfo () {
        log.info("viewMemberListInfo()");

        List<Member> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Member member = new Member();
            list.add(member);
        }

        return list;
    }

    @GetMapping("/view-map")
    public Map<String, Member> viewMemberMapInfo () {
        log.info("viewMemberMapInfo()");

        Map<String, Member> map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            Member member = new Member();
            map.put("key" + i, member);
        }

        return map;
    }

    // 아무런 리턴이 필요없는 경우라면 아래와 같이 처리하면 됨
    // Void는 void의 클래스 타입임
    @GetMapping("/returnVoid")
    public Void returnVoid () {
        log.info("returnVoid()");

        return null;
    }

    @GetMapping("/returnString")
    public String returnString () {
        log.info("returnString()");

        return "29th/list";
    }

    @GetMapping("/returnBoolean")
    public Boolean returnBoolean () {
        log.info("returnBoolean()");

        return true;
    }
}
