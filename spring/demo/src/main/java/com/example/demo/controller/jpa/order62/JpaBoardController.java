package com.example.demo.controller.jpa.order62;

import com.example.demo.entity.jpa.JpaBoard;
import com.example.demo.entity.jpa.VueJpaMember;
import com.example.demo.entity.order36.ProductBoard;
import com.example.demo.service.jpa.order62.JpaBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/62th/board")
@CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*")
public class JpaBoardController {

    @Autowired
    private JpaBoardService service;

    @PostMapping("/register")
    public void jpaBoardRegister (@Validated @RequestBody JpaBoard board) {
        log.info("jpaBoardRegister()");

        service.register(board);
    }

    @GetMapping("/list")
    public List<JpaBoard> jpaBoardList () {
        log.info("jpaBoardList()");

        return service.list();
    }

    @GetMapping("/{boardNo}")
    public JpaBoard jpaBoardRead (
            @PathVariable("boardNo") Integer boardNo) {
        log.info("jpaBoardRead()");

        return service.read(boardNo);
    }

    @PutMapping("/{boardNo}")
    public JpaBoard jpaBoardModify (
            @PathVariable("boardNo") Integer boardNo,
            @RequestBody JpaBoard jpaBoard) {
        log.info("jpaBoardModify(): " + jpaBoard);

        jpaBoard.setBoardNo(Long.valueOf(boardNo));
        service.modify(jpaBoard);

        return jpaBoard;
    }

    @DeleteMapping("/{boardNo}")
    public void jpaBoardRemove (
            @PathVariable("boardNo") Integer boardNo) {
        log.info("jpaBoardRemove()");

        service.remove(boardNo);
    }
}
