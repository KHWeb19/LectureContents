package com.example.demo.controller.order32;

import com.example.demo.entity.order32.Board;
import com.example.demo.service.order32.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/32th/board")
public class Fourth32thBoardController {

    @Autowired
    private BoardService boardService;

    // 33th
    @GetMapping("/register")
    //public String registerForm (Board board, Model model) {
    public String registerForm (Board board) {
    //public String registerForm () {
        log.info("registerForm");

        return "/32th/board/register";
    }

    // 33th
    @PostMapping("/register")
    public String register (Board board, Model model) {
        log.info("DB register");

        boardService.register(board);

        return "/32th/board/success";
    }

    @GetMapping("/list")
    public String list (Model model) {
        log.info("list");

        model.addAttribute("list", boardService.list());

        return "/32th/board/list";
    }

    // 33th
    @GetMapping("/read")
    public String read (int boardNo, Model model) {
        log.info("read");

        // 이렇게 적어놓지 않았을 경우엔
        // 리턴타입의 헝가리안 표기법으로 들어간다.
        // 즉 Board -> board
        // MemberAuth 라면 -> memberAuth 형태가되니 매우 주의해야함
        model.addAttribute(boardService.read(boardNo));

        return "/32th/board/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int boardNo, Model model) {
        log.info("modifyForm");

        model.addAttribute(boardService.read(boardNo));

        return "/32th/board/modify";
    }

    @PostMapping("/modify")
    public String modify (Board board, Model model) {
        log.info("modify");

        boardService.modify(board);

        return "/32th/board/success";
    }

    @PostMapping("/remove")
    public String remove (int boardNo, Model model) {
        log.info("remove");

        boardService.remove(boardNo);

        return "/32th/board/success";
    }
}
