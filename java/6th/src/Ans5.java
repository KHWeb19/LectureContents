public class Ans5 {
    public static void main(String[] args) {
        /*  4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
            힌트: Math.sqrt() - 루트 계산 */

        /* 분산, 표준편차 공식: https://math100.tistory.com/11 참고 */

        final int STUDENT_NUM = 30;
        final int MAX = 100;
        final int MIN = 60;

        int[] score = new int[STUDENT_NUM];

        int range = MAX - MIN + 1;
        float sum = 0;
        float average;

        // 평균을 구하기 위해
        // 랜덤 샘플(각각 1명이 가지는 값) 생성
        for (int i = 0; i < STUDENT_NUM; i++) {
            score[i] = (int) (Math.random() * range + MIN);
            sum += score[i];

            System.out.printf("score[%d] = %d\n", i, score[i]);
        }

        average = sum / STUDENT_NUM;
        System.out.println("평균 = " + average);

        sum = 0;

        for (int i = 0; i < STUDENT_NUM; i++) {
            sum += Math.pow(score[i] - average, 2);
        }

        System.out.println("분산 = " + (sum / STUDENT_NUM));
        System.out.println("표준편차 = 루트 분산 = " + Math.sqrt(sum / STUDENT_NUM));
    }
}
