package com.example.demo.controller.vue.order48;

import com.example.demo.entity.order32.Board;
import com.example.demo.service.order32.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/48th/vueboard")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class Eighteenth48thVueBoardController {

    @Autowired
    private BoardService service;

    @GetMapping("/list")
    public ResponseEntity<List<Board>> getVueBoardList () {
        log.info("getVueBoardList()");

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<Board> postRegisterBoard (@RequestBody Board board) {
        log.info("postRegisterBoard()");

        service.register(board);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }
}
