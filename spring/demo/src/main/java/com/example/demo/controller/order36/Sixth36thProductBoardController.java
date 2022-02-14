package com.example.demo.controller.order36;

import com.example.demo.entity.order36.ProductBoard;
import com.example.demo.service.order36.ProductBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/36th/product")
public class Sixth36thProductBoardController {

    @Autowired
    private ProductBoardService productBoardService;

    @GetMapping("/register")
    public String registerForm (ProductBoard productBoard) {
        log.info("registerForm");

        return "/36th/product/register";
    }

    @PostMapping("/register")
    public String register (ProductBoard productBoard, Model model) {
        log.info("DB register - productBoard 정보: " + productBoard);

        productBoardService.register(productBoard);

        return "/36th/product/success";
    }

    @GetMapping("/list")
    public String list (Model model) {
        log.info("list");

        model.addAttribute("list", productBoardService.list());

        return "/36th/product/list";
    }

    @GetMapping("/read")
    public String read (int productNo, Model model) {
        log.info("read");

        model.addAttribute(productBoardService.read(productNo));

        return "/36th/product/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int productNo, Model model) {
        log.info("modifyForm");

        model.addAttribute(productBoardService.read(productNo));

        return "/36th/product/modify";
    }

    @PostMapping("/modify")
    public String modify (ProductBoard productBoard, Model model) {
        log.info("modify");

        productBoardService.modify(productBoard);

        return "/36th/product/success";
    }

    @PostMapping("/remove")
    public String remove (int productNo, Model model) {
        log.info("remove");

        productBoardService.remove(productNo);

        return "/36th/product/success";
    }
}
