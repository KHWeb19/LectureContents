package com.example.demo.utility.school;

import lombok.Getter;

@Getter
public class SchoolClass {
    private float classMean;

    private int studentNum;
    private Student[] studentArr;

    public SchoolClass (int studentNum, int minScore) {
        studentArr = new Student[studentNum];

        for (int i = 0; i < studentNum; i++) {
            studentArr[i] = new Student(minScore);
        }

        this.studentNum = studentNum;
    }

    public void doEnglishExam () {
        for (int i = 0; i < studentNum; i++) {
            studentArr[i].doEnglishExam();
        }
    }

    public void calcClassMean () {
        float sum = 0;

        for (int i = 0; i < studentNum; i++) {
            sum += studentArr[i].getEngScore();
        }

        classMean = sum / studentNum;
    }
}
