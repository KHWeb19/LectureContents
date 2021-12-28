public class Ans7 {
    public static void main(String[] args) {
        /*  회사에 직원이 7명이 있습니다.
            모두 입사동기로 3500만원으로 시작하였다고 합니다.
            각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
            이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다. */

        // 구현 전략
        // 1. 고정값 7명 - 직원
        // 2. 초봉 - 3500만원 고정
        // 3. 연봉 인상률 - 1 ~ 10% 랜덤값
        // 4. 5년후 받을 값을 시뮬레이션하기

        final int EMP_NUM = 7;
        final float INIT_PAY = 3500;
        final int MAX = 10;
        final int MIN = 1;
        final int END_YEAR = 5;
        final float PERCENT = 1 / 100.f;

        int range = MAX - MIN + 1;
        float percent;

        float[] emp = new float[EMP_NUM];

        for (int i = 0; i < EMP_NUM; i++) {
            emp[i] = INIT_PAY;
        }

        for (int i = 1; i < END_YEAR; i++) {
            for (int j = 0; j < EMP_NUM; j++) {
                percent = (float) (Math.random() * range + MIN) * PERCENT;
                // 1%의 인상률이라면
                // 최종 연봉 = 현재 연봉 + 현재 연봉 * 인상률
                //          = 현재 연봉 * (1 + 인상률)
                // emp[j] = emp[j] * (1 + percent);
                emp[j] += (emp[j] * percent); // emp[j] = emp[j] + emp[j] * percent

                System.out.printf("연봉[%d] = %f, 증가율 = %f\n", j, emp[j], percent);
            }

            System.out.println();
        }
    }
}
