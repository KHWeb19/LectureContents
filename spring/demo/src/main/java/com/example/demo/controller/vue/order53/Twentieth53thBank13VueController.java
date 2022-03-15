package com.example.demo.controller.vue.order53;

import com.example.demo.entity.order36.ProductBoard;
import com.example.demo.service.order36.ProductBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/53th/vueproduct")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class Twentieth53thBank13VueController {

    @Autowired
    private ProductBoardService productBoardService;

    @PostMapping("/register")
    public ResponseEntity<ProductBoard> register (
            @RequestBody ProductBoard productBoard) {
        log.info("DB register - productBoard 정보: " + productBoard);

        productBoardService.register(productBoard);

        return new ResponseEntity<>(productBoard, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<ProductBoard>> list () {
        log.info("list");

        return new ResponseEntity<>(productBoardService.list(), HttpStatus.OK);
    }

    @GetMapping("/{productNo}")
    public ResponseEntity<ProductBoard> read (
            @PathVariable("productNo") Integer productNo) {
        log.info("read");

        ProductBoard productBoard = productBoardService.read(productNo);

        return new ResponseEntity<>(productBoard, HttpStatus.OK);
    }

    @PutMapping("/{productNo}")
    public ResponseEntity<ProductBoard> modify (
            @PathVariable("productNo") Integer productNo,
            @RequestBody ProductBoard productBoard) {
        log.info("modify: " + productBoard);

        productBoard.setProductNo(productNo);
        productBoardService.modify(productBoard);

        return new ResponseEntity<>(productBoard, HttpStatus.OK);
    }

    @DeleteMapping("/{productNo}")
    public ResponseEntity<Void> remove (
            @PathVariable("productNo") Integer productNo) {
        log.info("remove");

        productBoardService.remove(productNo);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
