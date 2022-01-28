package com.example.demo.controller.order26;

import com.example.demo.utility.Dice;
import com.example.demo.utility.thread.ThreadWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank7Dash26thController {

    private final static Logger logger =
            LoggerFactory.getLogger(Bank7Dash26thController.class);

    @RequestMapping("/homework1")
    public String bank7Homework1 (Model model) {
        Dice dice = new Dice();
        dice.rollDice();

        model.addAttribute("diceNum", dice.getDiceNum());

        return "26th/homework1";
    }

    @RequestMapping("/homework2")
    public String bank7Homework2 (Model model) {
        logger.info("homework2");

        model.addAttribute("threadNum", ThreadWorker.getSyncLockTest());

        return "26th/homework2";
    }
}
