package com.example.demo.controller.jpa.order62;

import com.example.demo.entity.jpa.JpaBoard;
import com.example.demo.service.jpa.order62.JpaBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public void jpaBoardRegister () {
        log.info("jpaBoardRegister()");
    }

    @GetMapping("/list")
    public List<JpaBoard> jpaBoardList () {
        log.info("jpaBoardList()");

        return service.list();
    }
}
