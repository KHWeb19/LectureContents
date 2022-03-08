package com.example.demo.controller.vue.order49;

import com.example.demo.entity.order32.Board;
import com.example.demo.service.order32.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/49th/vueboard")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class Nineteenth49thVueBoardController {

    @Autowired
    private BoardService service;

    @GetMapping("/{boardNo}")
    public ResponseEntity<Board> getVueBoardRead(
            @PathVariable("boardNo") Integer boardNo) {
        log.info("getVueBoardRead()");

        Board board = service.read(boardNo);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    // 반드시 가변 인자 방식이어야함
    @DeleteMapping("/{boardNo}")
    public ResponseEntity<Void> vueBoardRemove(
            @PathVariable("boardNo") Integer boardNo) {
        log.info("vueBoardRemove()");

        service.remove(boardNo);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{boardNo}")
    public ResponseEntity<Board> vueBoardModify(
            @PathVariable("boardNo") Integer boardNo,
            @RequestBody Board board) {
        log.info("vueBoardModify()");

        board.setBoardNo(boardNo);
        service.modify(board);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }
}
