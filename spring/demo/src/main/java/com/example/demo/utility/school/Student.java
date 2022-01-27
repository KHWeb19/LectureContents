package com.example.demo.utility.school;

import lombok.Getter;

@Getter
public class Student {
    private int engScore;

    private final int MAX = 100;
    private int minScore;
    private int range;

    public Student (int minScore) {
        this.minScore = minScore;

        range = MAX - minScore + 1;
    }

    public void doEnglishExam () {
        engScore = (int) (Math.random() * range + minScore);
    }
}
