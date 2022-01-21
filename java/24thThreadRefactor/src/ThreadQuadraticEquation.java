public class ThreadQuadraticEquation extends ThreadCommon {

    public ThreadQuadraticEquation(int threadNum, int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        float curX = dx * xStart[localThreadId];

        for (int i = xStart[localThreadId]; i <= xEnd[localThreadId]; i++, curX += dx) {
            sum += dx * curX * curX;
            System.out.printf("Thread ID = %d, sum = %.12f\n", localThreadId, sum);
        }

        System.out.printf("sum = %.12f\n", sum);
    }
}
