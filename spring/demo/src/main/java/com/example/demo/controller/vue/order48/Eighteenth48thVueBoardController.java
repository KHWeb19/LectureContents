package com.example.demo.controller.vue.order48;

import com.example.demo.entity.order32.Board;
import com.example.demo.service.order32.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/48th/vueboard")
public class Eighteenth48thVueBoardController {

    @Autowired
    private BoardService service;

    @ResponseBody
    @GetMapping("/list")
    public List<Board> getVueBoardList () {
        log.info("getVueBoardList()");

        return service.list();
    }
}
