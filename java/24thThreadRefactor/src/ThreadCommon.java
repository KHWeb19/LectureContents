public class ThreadCommon extends Thread {

    final static float dx = 0.001f;
    static int threadCnt = 0;
    protected int localThreadId;

    protected int total;

    protected float sum;

    protected int x, y;

    protected static int realTotal;
    protected static int threadNum;
    protected static int totalRemain;
    // 현재 이녀석은 Critical Section이 되어버림
    // 해결책은 2가지
    // 1. Lock을 걸거나
    // 2. 배열로 만들어서 영향을 받지 않게 함 <<<--- 이게 효율적임 (스레드 개수만큼 할당해야함)
    // Critical Section은 여러 태스크(스레드, 프로세스)에 의해 공유되는 자원
    protected static int[] xStart;
    protected static int[] xEnd;

    // 가로 길이 2를 아주 작은값인 0.001로 나눈다.
    // 여기서 스레드를 4개 정도 사용한다면
    // 0 ~ 2를 4등분 하고 각각의 스레드에게 이것을 4등분해서 주면 된다.

    // 1. 등분 했을 경우 스레드 각각이 돌려야 하는 전체 숫자를 먼저 파악
    // 2. 이것을 베이스로 시작과 끝 값을 정하면 됨
    public ThreadCommon(int x, int y) {
        this.x = x;
        this.y = y;

        // 1. realTotal값을 통해서 threadNum으로 나눴을때 몫이 얼마가 나오는지 판정한다.
        // 2. 나머지값을 판정한다.
        // 3. 각 threadId 들에게 나머지가 0이 될 때까지 1개씩 나눠준다.
        calcEachThreadTotal();

        localThreadId = threadCnt++;

        // xTotalEnd는 전역으로 현재 어디까지 갔는지 파악
        // xEnd는 실제 local(지역) 변수로 스레드마다 각기 다르게 가지게 해야함
        if (localThreadId == 0) {
            xStart[localThreadId] = 0;
            xEnd[localThreadId] = total - 1;
        } else {
            //          [0]     [1]     [2]     [3]     [4]     [5]
            // total    334     334     333     333     333     333
            // xStart     0     334     668    1001    1334    1667
            // xEnd     333     667    1000    1333    1666    1999
            xStart[localThreadId] = xEnd[localThreadId - 1] + 1;
            xEnd[localThreadId] = xEnd[localThreadId - 1] + total;
        }

        sum = 0;

        System.out.printf("xStart = %4d, xEnd = %4d, thread ID = %d\n",
                xStart[localThreadId], xEnd[localThreadId], localThreadId);
    }

    public static void calcRealTotal (int x) {
        realTotal = (int) (Math.ceil(x / dx));
        System.out.println("realTotal = " + realTotal);

        totalRemain = realTotal % threadNum;
        xEnd = new int[threadNum];
        xStart = new int[threadNum];

        for (int i = 0; i < threadNum; i++) {
            xStart[i] = 0;
            xEnd[i] = 0;
        }
    }

    public void calcEachThreadTotal () {
        total = realTotal / threadNum;

        if (totalRemain-- > 0) {
            total++;
        }

        System.out.println("total = " + total);
    }

    public float getSum() {
        return sum;
    }
}
