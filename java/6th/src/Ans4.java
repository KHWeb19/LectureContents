public class Ans4 {
    public static void main(String[] args) {
        /*  반 학생이 30명이 있다.
            이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
            이 상태에서 학생들의 점수를 임의로 배치하고
            학급의 평균값을 구해보도록 한다. */

        // 1. 고정값 30
        // 2. 최소값 60
        // 3. 난수 생성
        // 4. 배열 필요

        final int STUDENT_NUM = 30;
        final int MAX = 100;
        final int MIN = 60;

        int[] score = new int[STUDENT_NUM];

        int range = MAX - MIN + 1;
        int sum = 0;

        for (int i = 0; i < STUDENT_NUM; i++) {
            score[i] = (int) (Math.random() * range + MIN);
            sum += score[i];

            System.out.printf("score[%d] = %d\n", i, score[i]);
        }

        System.out.println("반 평균 = " + (float)(sum) / STUDENT_NUM);
    }
}
