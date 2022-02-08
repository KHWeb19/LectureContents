package com.example.demo.controller.order32;

import com.example.demo.entity.order32.Board;
import com.example.demo.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/32th/board")
public class Fourth32thBoardController {

    //@Autowired
    //private BoardService boardService;

    @GetMapping("/register")
    public String registerForm (Board board, Model model) {
        log.info("registerForm");

        return "/32th/board/register";
    }

    @GetMapping("/list")
    public String list (Model model) {
        log.info("list");

        //model.addAttribute("list", boardService.list());

        return "/32th/board/list";
    }
}
