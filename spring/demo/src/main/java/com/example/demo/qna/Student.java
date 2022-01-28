package com.example.demo.qna;

import lombok.Data;

@Data
public class Student {
    private final int STUDENT_NUM = 30;
    private final int MAX = 100;
    private final int MIN = 60;

    private int sum = 0;
    private int average;

    public void initAverage() {
        for (int i=0; i<STUDENT_NUM; i++) {
            sum += (int)(Math.random()*(MAX-MIN+1)+MIN);
        }
        average = sum/STUDENT_NUM;
    }
}