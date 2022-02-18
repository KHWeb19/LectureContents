package com.example.demo.controller.order40;

import com.example.demo.entity.order40.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/40th/prob11")
public class TenthBank11ProbController {

    /* 1. 회원 가입
       2. 리스트 보기(원래라면 관리자 권한 있는 상태에서)
       3. 개인 정보 수정
       4. 회원 탈퇴
       5. 회원 상세 정보 보기(중국은 되야 할 수 있는 것) <<<--- 개인 정보 보호법을 주의해야합니다
       6. 로그인 기능 */
    @GetMapping("/main")
    public String mainPage () {
        log.info("mainPage()");

        return "/40th/prob11/main";
    }

    @GetMapping("/register")
    public String memberRegisterForm (Member member) {
        log.info("memberRegisterForm()");

        return "/40th/prob11/register";
    }

    @PostMapping("/register")
    public String memberRegister (Member member, Model model) {
        log.info("memberRegister()");

        return "/40th/prob11/success";
    }

    @GetMapping("/list")
    public String memberList () {
        log.info("memberList()");

        return "/40th/prob11/list";
    }

    @GetMapping("/modify")
    public String memberModifyForm () {
        log.info("memberModifyForm()");

        return "/40th/prob11/modify";
    }

    @PostMapping("/modify")
    public String memberModify () {
        log.info("memberModify()");

        return "/40th/prob11/success";
    }

    @PostMapping("/delete")
    public String memberDelete () {
        log.info("memberDelete()");

        return "/40th/prob11/success";
    }

    @GetMapping("/read")
    public String memberRead () {
        log.info("memberRead()");

        return "/40th/prob11/read";
    }

    @GetMapping("/login")
    public String loginForm () {
        log.info("loginForm()");

        return "/40th/prob11/login";
    }

    @PostMapping("/login")
    public String login () {
        log.info("login");

        return "/40th/prob11/success";
    }
}
