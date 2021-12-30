public class QnA4 {
    public static void main(String[] args) {

        // f = 15
        // 16^1 x 15 + 16^0 x 15: ex) 0xff - 255
        // 10^1 x 5  + 10^0 x 3:  ex) 53
        // 다만 16진수의 경우 문자와 표기에 혼동이 생겨
        // 추가적으로 맨 앞에 0x 를 붙여주도록 만듭니다.
        
        // byte는 1바이트이므로 8비트다.
        // 2^8개를 표현할 수 있음: 총 256개를 표현할 수 있음
        // 컴퓨터는 0이란 숫자를 표기하기 때문에 실제론 0 ~ 255임
        // 그러므로 2^8 - 1 = 255가 최대값이라는 뜻
        byte limit = (byte) 0xff;
        // 왜 숫자의 제한이 2^n - 1이냐라는 질문에 답을 하려면 비트 시스템을 이해해야합니다.
        // 그래서 제일 간단한 0xff라는 녀석을 다루려고 하고 있음
        // 0xff를 다루기 위해서는 아래의 사항을 알아야 합니다.

        // 1. 16진수 시스템
        // 2. 2진수 시스템
        // 3. 비트 개념과 비트 연산자(shift)

        // (1) 16진수
        // 10진수:    0,  1,  2,  3,  4,  5,  6,  7,  8,  9,
        //          10, 11, 12, 13, 14, 15, 16, 17, 18, 19

        // 16진수:    0,  1,  2,  3,  4,  5,  6,  7,  8,  9, 10,  11,   12,  13,  14,  15,
        //          10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 110, 111, 112, 113, 114, 115
        //  11 1 인지 1 11인지 1 1 1인지 구별이 안되는 상황이 발생함
        //  그래서 양키들이 자기네들이 만든만큼 알파벳을 도입함
        //  10 - a, 11 - b, 12 - c, 13 - d, 14 - e, 15 - f
        //
        // 그래서 다시 쓰면
        // 16진수:    0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  a,  b,  c,  d,  e,  f
        //          10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1a, 1b, 1c, 1d, 1e, 1f

        System.out.printf("byte limit: 0x%x\n", limit);
        System.out.format("0x%x%n", limit);

        for (int i = 0; i < 8; i++) {
            if (i != 0 && i % 4 == 0) {
                System.out.print(" ");
            }

            System.out.print(((0x80 >>> i) & limit) == 0 ? '0' : '1');
        }

        System.out.println();

        short test = (short) 0x0fff;

        System.out.printf("short limit: 0x%x\n", test);
        System.out.format("0x%x%n", test);

        for (int i = 0; i < 16; i++) {
            if (i != 0 && i % 4 == 0) {
                System.out.print(" ");
            }

            System.out.print(((0x8000 >>> i) & test) == 0 ? '0' : '1');
        }

        System.out.println();

        System.out.println("short test 2^12(4096) - 1: " + test);
    }
}
