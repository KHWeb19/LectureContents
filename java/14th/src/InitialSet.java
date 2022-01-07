public class InitialSet {
    // 정수형 배열, 길이, 보정치(BIAS), 점핑
    int[] initArr;
    int length;
    int bias;
    int jumping;

    int[] seqArr;

    // 1번 케이스
    public InitialSet (final int[] arr, int bias) {
        length = arr.length;

        // 배열 내용 복사
        this.initArr = arr.clone();
        this.bias = bias;

        jumping = 0;
    }
    // 2번 케이스
    public InitialSet (final int[] arr, int bias, int jumping) {
        length = arr.length;

        this.initArr = arr.clone();
        this.bias = bias;
        this.jumping = jumping;
    }

    public void initArr () {
        for (int i = 0; i < length; i++) {
            seqArr[i] = initArr[i];
        }
    }

    public int getNthOrderData (int count) {
        seqArr = new int[count];

        initArr();

        /* 현재 구조의 문제점 2개 처리에는 적합하지만 3개, 4개, 5개, n개 처리는 불가능한 구조
        for (int i = length; i < count; i++) {
            seqArr[i] = seqArr[i - 1] + seqArr[i - 2];
        } */

        int tmp;
        // 2 ~ 19 or 4 ~ 24 or 3 ~ 24
        for (int i = length; i < count; i++) {
            tmp = 0;
            // 0 ~ 1 or 0 ~ 3 <<<--- bias
            // 우리가 맞춰야 하는 조건은 [0] + [1] + [2] = [4]
            //                       [1] + [2] + [3] = [5]
            //                       [2] + [3] + [4] = [6]
            
            // 앞서서는 길이값이 3인 상태에서 실제 배치가 인덱스 [4]에 하므로
            // 길이 + 보정치로 인덱스 위치를 맞추는 작업이 필요했기 때문에 사용함
            
            // 현재 케이스는 길이가 애초에 4이므로 인덱스 [4]는 맞춰짐
            // 그러나 연산을 3번만 해야하므로 bias를 반복 계산을 제한하는 루틴으로 활용함
            for (int j = length; j > bias; j--) {
                // 4 - 4, 4 - 3, 4 - 2 ===> 0, 1, 2
                // 5 - 4, 5 - 3, 5 - 2 ===> 1, 2, 3

                // 2번째 방식의 jumping을 이용하는 경우는
                // [0] + [2] = [3]
                // [1] + [3] = [4]
                tmp += seqArr[i - j];
                j -= jumping;
            }

            seqArr[i] = tmp;
            System.out.printf("seqArr[%d] = %d\n", i, seqArr[i]);
        }

        return seqArr[count - 1];
    }
}
