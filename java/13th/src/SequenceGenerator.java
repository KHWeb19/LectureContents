public class SequenceGenerator {
    int start;
    int end;

    int range;

    int[] seqArr;
    int sum;

    public SequenceGenerator (final int start, final int end) {
        this.start = start;
        this.end = end;

        range = end - start + 1;
        seqArr = new int[range];
    }

    public void createSequence () {
        for (int i = start - 1; i < end; i++) {
            seqArr[i] = i + start;
        }
    }
    public void printCondition (int condition) {
        for (int i = start - 1; i < end; i++) {
            if (seqArr[i] % 2 == condition) {
                System.out.printf("seqArr[%d] = %d\n", i, seqArr[i]);
            }
        }
    }
    public int findAndSum (int find) {
        sum = 0;

        for (int i = start - 1; i < end; i++) {
            if (seqArr[i] % find == 0) {
                sum += seqArr[i];
            }
        }

        return sum;
    }
    public void printRandomCondition (final int randStart, final int randEnd) {
        int range = randEnd - randStart + 1;

        int rand = (int) (Math.random() * range + randStart);

        for (int i = start - 1; i < end; i++) {
            if (seqArr[i] % rand == 0) {
                System.out.printf("seqArr[%d] = %d\n", i, seqArr[i]);
            }
        }
    }
    public void printRandomTravel (final int randStart, final int randEnd) {
        int range = randEnd - randStart + 1;

        int rand;

        for (int i = start - 1; i < end; i += rand) {
            rand = (int) (Math.random() * range + randStart);

            System.out.printf("seqArr[%d] = %d\n", i, seqArr[i]);
        }
    }
    public void printRandomTimesTravel (final int randStart, final int randEnd) {
        int range = randEnd - randStart + 1;

        int rand, tmp = 0;

        // 1. 루프를 돈다.
        // 2. 난수 할당을 받는다.
        // 3. 난수의 배수인지 판정한다.
        // 4. 아니면 배수가 되도록 만들고 출력한다.
        // 5. 반복
        
        // 방어 루틴을 활용하지 않는다면 ?
        // 찾은 난수의 근처 배수값까지 차이를 i += 더하기로 처리하면 해결됨
        for (int i = start - 1; i < end; i++) {
            rand = (int) (Math.random() * range + randStart);

            if (seqArr[i] % rand != 0) {
                // 현재 숫자 근처의 rand로 나눠 떨어지는 숫자 찾기
                // 현재 숫자 / rand 의 몫을 보고 나눠 떨어지지 않았으니
                // 여기에 더하기 1 한거에 곱해서 현재값을 뺀 값만큼 + 하면 된다.
                tmp = (seqArr[i] / rand + 1) * rand - seqArr[i];
                i += tmp;
            }

            if (i < 100) {
                System.out.printf("rand = %2d, seqArr[%2d] = %2d\n", rand, i, seqArr[i]);
            }
        }
    }
}
