package com.example.demo.qna;

public class Student2 {
    final int stu_num = 30;
    final int MAX_SCORE = 100;
    final int MIN_SCORE = 60;

    float average;
    final int range_score = MAX_SCORE - MIN_SCORE + 1;

    int sum = 0;

    //새로 고침 할 때마다 sum 값이 누적되므로 0으로 초기화함
    public Student2 () {
        sum = 0;
    }

    public int score(){
        int [] stuscore = new int[stu_num];

        for(int i = 0; i < stu_num; i++){
            System.out.printf("stu_num = %d\n",stu_num);
            stuscore[i] = (int)(Math.random() * range_score + MIN_SCORE);
            sum += stuscore[i];
            System.out.printf("현재 i: %d, 학생들의 점수의 총합 = %d\n", i, sum);
        }

        return sum;
    }
    public float average(){
        average = (float)sum/stu_num;
        return average;
    }
}