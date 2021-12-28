/*  1. 필요한 상수값들 열거
    2. 소수점 처리를 하려고 하다보니 꼼수를 활용함
       0.1 ~ 0.01 사이의 난수를 출력하기 위해
       Random의 nextFloat이나 nextDouble을 사용하는 방법도 있지만
       Math.random()을 사용할 경우엔 0.0 ~ 0.9999999 까지라는 부분을
       처리하는 방식에 대해 살펴보는 부분이 필요함
    3. 실제 Math.random() * 10 + 1을 하면 1 ~ 10.99999 까지고
       여기에 우리가 강제로 (int) 캐스팅을 해서 1 ~ 10까지 사용해왔음
       만약 int 캐스팅을 적용한다면 값은 0.1, 0.2, 0.3, ... 0.9 로 끊겨서 나올 것
    4. 그러므로 1000 ~ 10000으로 int 캐스팅을 한 이후
       다시 1000을 나눠서 소수점 형식으로 만듬
       그러면 1.0 ~ 10.0 사이의 소수점 값들이 생성됨
    5. 그리고 연봉에 실제 증가율을 적용하여 계산함 */

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

        // Math.random() - 0.0 ~ 1.0 미만 (0.99999)
        // rand * range - 0.0 ~ range 미만
        // (Math.random() * range + MIN)
        // MIN ~ (range - 1).xxxx 까지 나온다는 의미
        // Math.random() * 10 + 1 ---> 1 ~ 10.999999
        // 소수점 셋 째까지 활용한다 가정하고
        // Math.random() - 1000 ~ 10000 ---> 양변에 1000을 나누면 1 ~ 10
        final int MAX = 10000;
        final int MIN = 1000;
        final int END_YEAR = 5;
        final float BIAS = 1000;
        final float PERCENT = 1 / 100.f;

        int range = MAX - MIN + 1;
        float percent;

        float[] emp = new float[EMP_NUM];

        for (int i = 0; i < EMP_NUM; i++) {
            emp[i] = INIT_PAY;
        }

        for (int i = 1; i < END_YEAR; i++) {
            for (int j = 0; j < EMP_NUM; j++) {
                // (int) (Math.random() * range + MIN) - 1000 ~ 10000: A
                // A / BIAS = 1 ~ 10: B
                // B * PERCENT = 0.01 ~ 0.1
                percent = (float) ((int) (Math.random() * range + MIN) / BIAS) * PERCENT;
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
