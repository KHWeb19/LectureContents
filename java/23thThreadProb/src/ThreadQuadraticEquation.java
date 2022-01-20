public class ThreadQuadraticEquation extends Thread {
    //final static float dx = 0.001f; //    0.0046 부족 오차
    final static float dx = 0.0001f; //   0.0019 부족 오차
    //final static float dx = 0.00001f; //  0.0047 넘침 오차
    //final static float dx = 0.000001f; // 0.137 부족 오차
    private int xStart, xEnd;
    static int threadCnt = 0;
    private int localThreadId;

    final static int THREAD_MAX = 4;
    static int total;

    float sum;

    public ThreadQuadraticEquation () {
        localThreadId = threadCnt++;
        xStart = 0 + total * localThreadId;
        xEnd = total * (localThreadId + 1) - 1;

        sum = 0;

        System.out.printf("xStart = %5d, xEnd = %5d, thread ID = %d\n",
                xStart, xEnd, localThreadId);
    }

    public static void calcEachThreadTotal (int start, int end) {
        // ceil() 천정 함수: 즉 올림
        int realTotal = (int) (Math.ceil((end - start) / dx));
        System.out.println("realTotal = " + realTotal);

        total = realTotal / THREAD_MAX;
        System.out.println("total = " + total);
    }

    public float getSum() {
        return sum;
    }

    @Override
    public void run() {
        float curX = dx * xStart;

        // y = x^2  높이값 curX * curX
        // 사각형의 넓이는 dx * y = dx * curX * curX
        for (int i = xStart; i <= xEnd; i++, curX += dx) {
            // 0.0001 = dx
            // curX = 2.5677
            // curX = 2.5677
            // 소수점 계산 특성: 소수점 4번째 자리숫자와 소수점 4번째 자리 숫자의 연산은 무엇을 만드나 ?
            // 소수점 8번째 자리의 결과를 만들어내게 됨
            // 다시 거기에 0.0001을 곱하니 소수점이 더 뒤로 밀려가게 되고
            // 데이터타입이 표시할 수 없는 소수점을 만들게 될 가능성이 높아짐
            // 이러한 사항이 한도를 넘어가게 되면 dx = 0.000001f과 같이
            // 납득하기 어려운 오차를 유발할 수 있다.
            sum += dx * curX * curX;
        }

        System.out.printf("sum = %.12f\n", sum);
    }
}
