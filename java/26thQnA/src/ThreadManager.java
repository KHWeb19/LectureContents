public class ThreadManager extends Thread {

    final static float dx = 0.001f;
    protected int xStart, xEnd;
    static int threadCnt = 0;
    protected int localThreadId;

    float sum = 0;

    protected static final int THREAD_MAX = 4;
    static int total;

    //가로 길이 2를 아주 작은 값인 0.001로 나눈다.
    //여기서 스레드를 4개 정도 사용한다면 0~2를 4등분 하고 각각의 스레드에게 이것을 4등분해서 주면 된다.

    //1. 등분 했을 경우 스레드 각각이 돌려야 하는 전체 숫자를 먼저 파악
    //2. 이것을 베이스로 시작과 끝 값을 정하면 됨
    public ThreadManager() {
        System.out.println("ThreadManager()");
        localThreadId = threadCnt++;
        xStart = 0 + total * localThreadId;
        xEnd = total * (localThreadId + 1) - 1;

        sum = 0;

        System.out.printf("'Xstart = %4d, xEnd = %4d, thread ID = %4d, thread Cnt = %4d\n",
                xStart, xEnd, localThreadId, threadCnt);
    }

    public static void calRectangleThreadTotal(int X) {
        //ceil() 천정 함수: 즉 올림
        int realTotal = (int) (Math.ceil(X / dx));
        System.out.println("realTotal = " + realTotal);

        total = realTotal / THREAD_MAX;

        //return realTotal / THREAD_MAX;
        System.out.println("total = " + total);
    }

    public static void calQuadraticThreadTotal(int start, int end) {
        //ceil() 천정 함수: 즉 올림
        int realTotal = (int) (Math.ceil((end - start) / dx));
        System.out.println("realTotal = " + realTotal);

        total = realTotal / THREAD_MAX;

        //return realTotal / THREAD_MAX;
        System.out.println("total = " + total);
    }
}