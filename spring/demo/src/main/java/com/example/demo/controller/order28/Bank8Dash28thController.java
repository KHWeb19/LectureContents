package com.example.demo.controller.order28;

import com.example.demo.controller.order26.Bank7Dash26thController;
import com.example.demo.utility.school.SchoolClass;
import com.example.demo.utility.series.KindsOfSequence;
import com.example.demo.utility.series.MySequence;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
// 이게 들어가면 아래쪽에서 경로 입력할 때
// 뭐가 됫건 맨 앞에는 무조건 /28th/~~~~ 형태로 URL 요청을 해야함
@RequestMapping("/28th")
public class Bank8Dash28thController {
    private final static Logger logger =
            LoggerFactory.getLogger(Bank7Dash26thController.class);

    @RequestMapping("/homework1")
    public String bank8Homework1 (Model model) {
        /*
        1. 아래와 같은 등비 수열이 있다.
        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
        (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)
         */
        MySequence sequence = new MySequence(2, KindsOfSequence.GEOMETRIC);
        sequence.calcSequenceOrder(31);

        model.addAttribute("sequence", sequence.getResult());

        return "28th/homework1";
    }

    @RequestMapping("/homework4")
    public String bank8Homework4 (Model model) {
        logger.info("homework4");

        /*
        반 학생이 30명이 있다.
        이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        이 상태에서 학생들의 영어 점수를 임의로 배치하고
        학급의 평균값을 구해보도록 한다.

        학급 <-> 학생 <-> 영어 점수
         */

        SchoolClass sc = new SchoolClass(30, 60);
        sc.doEnglishExam();
        sc.calcClassMean();

        model.addAttribute("classMean", sc.getClassMean());

        return "28th/homework4";
    }
}
