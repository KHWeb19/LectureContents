import java.util.Arrays;

public class MyCustomDataType {
    int[] intArr;
    float[] floatArr;
    double[] doubleArr;

    int intRange;
    float floatRange;

    final int INT_MAX = 50;
    final int INT_MIN = 30;

    final float FLOAT_MAX = 4.75f;
    final float FLOAT_MIN = -4.75f;
    final int BIAS = 100;

    static final int INT_PROC = 1;
    static final int FLOAT_PROC = 2;
    static final int DOUBLE_PROC = 3;

    int intNum, floatNum, doubleNum;

    // 생성자 만드는 방법
    // 1. public을 적는다.
    // 2. 클래스 이름과 동일한 이름을 작성한다.
    // 3. 매서드 작성하듯이 입력으로 사용할 정보들을 입력하도록 한다.
    // 4. 중괄호 내부에 이 매서드(생성자)가 구동할 작업을 작성한다.
    // *** 흥미로운 부분이라면 생성자는 리턴 타입이 없다!!!
    
    // 역할은 여태까지 생성자를 배우지 않아서
    // init ~~~ 하면서 만들었던 작업들을 사실 요녀석이 해줘야함
    public MyCustomDataType (int intNum, int floatNum, int doubleNum) {
        System.out.println("나는 (int, int, int) 생성자!");

        intArr = new int[intNum];
        floatArr = new float[floatNum];
        doubleArr = new double[doubleNum];

        setRange();
    }

    public void decisionAlloc(int arrNum, final int DECISION) {
        switch (DECISION) {
            case INT_PROC:
                intArr = new int[arrNum];
                setIntRange();
                break;

            case FLOAT_PROC:
                floatArr = new float[arrNum];
                setRealRange();
                break;

            case DOUBLE_PROC:
                doubleArr = new double[arrNum];
                setRealRange();
                break;

            default:
                System.out.println("올바른 값을 입력하세요!");
                break;
        }
    }

    // 이 녀석은 왜 필요하지 ?
    // main에서
    // MyCustomDataType(2); 정수형
    // MyCustomDataType(2); float 형
    // MyCustomDataType(2); double 형
    public MyCustomDataType (int intNum, final int DECISION) {
        System.out.println("나는 (int, int) 생성자!");

        System.out.println("DECISION: " + DECISION);
        decisionAlloc(intNum, DECISION);
    }

    public void setIntRange () {
        intRange = INT_MAX - INT_MIN + 1;
    }

    public void setRealRange () {
        // 0.0 ~ 1.0 미만 - Math.random()
        // 4.75 + 4.75 -> 9.5
        // 0.0 ~ 9.5 미만 + 0.1
        // 0.1 ~ 9.6 미만 (9.5xx)
        // 그래서 최종적으로 ===> (-475 ~ 475) / 100
        // floatRange = 951
        floatRange = FLOAT_MAX * BIAS - FLOAT_MIN * BIAS + 1;
    }

    public void setRange () {
        setIntRange();
        setRealRange();
    }

    public MyCustomDataType (int intNum, float floatNum, double doubleNum) {
        System.out.println("나는 (int, float, double) 생성자!");
    }

    // 매서드 덮어쓰기(오버로딩)의 경우엔
    public MyCustomDataType () {
        System.out.println("나는 기본 생성자!");
    }

    public void allocIntRandom () {
        // length는 실제 배열의 길이를 구해올 수 있음
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) (Math.random() * intRange + INT_MIN);
        }
    }

    public void allocFloatRandom () {
        for (int i = 0; i < floatArr.length; i++) {
            // (0.0 ~ 950) + (-4.75f)
            //float tmp = ((int) (Math.random() * floatRange)) / BIAS + FLOAT_MIN;

            float tmp = (int) (Math.random() * floatRange);
            //System.out.printf("tmp = %f\n", tmp);

            tmp /= BIAS;
            //System.out.printf("tmp = %f\n", tmp);

            floatArr[i] = tmp + FLOAT_MIN;
        }
    }

    public void allocDoubleRandom () {
        for (int i = 0; i < doubleArr.length; i++) {
            double tmp = (int) (Math.random() * floatRange);
            tmp /= BIAS;

            doubleArr[i] = tmp + FLOAT_MIN;
        }
    }

    public void allocRandom () {
        allocIntRandom();
        allocFloatRandom();
        allocDoubleRandom();
    }

    @Override
    public String toString() {
        return "MyCustomDataType{" +
                "intArr=" + Arrays.toString(intArr) +
                ", floatArr=" + Arrays.toString(floatArr) +
                ", doubleArr=" + Arrays.toString(doubleArr) +
                '}';
    }
}
