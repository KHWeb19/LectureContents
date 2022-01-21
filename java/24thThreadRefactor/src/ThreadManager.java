public class ThreadManager {
    private ThreadRectangle[] tRect;
    // BlaBla[] blabla;
    private ThreadQuadraticEquation[] tqe;

    private int threadNum;
    private int serviceCode;

    // 4, 2, 2, ThreadCalculation.SQUARE
    public ThreadManager (int threadNum, int parameter1,
                          int parameter2, int serviceCode) {

        this.threadNum = threadNum;
        this.serviceCode = serviceCode;

        checkService(threadNum);
        serviceAlloc(parameter1, parameter2);
    }

    public void checkService (int threadNum) {
        switch (serviceCode) {
            case ThreadCalculation.SQUARE:
                tRect = new ThreadRectangle[threadNum];
                break;

            case ThreadCalculation.QUADRATIC:
                tqe = new ThreadQuadraticEquation[threadNum];
                break;
        }
    }

    public void serviceAlloc (int parameter1, int parameter2) {
        switch (serviceCode) {
            case ThreadCalculation.SQUARE:
                ThreadCommon.threadNum = threadNum;
                ThreadCommon.calcRealTotal(parameter1);
                ThreadCommon.threadCnt = 0;

                for (int i = 0; i < threadNum; i++) {
                    tRect[i] = new ThreadRectangle(threadNum, parameter1, parameter2);
                }
                break;

            case ThreadCalculation.QUADRATIC:
                ThreadCommon.threadNum = threadNum;
                ThreadCommon.calcRealTotal(parameter2 - parameter1);
                ThreadCommon.threadCnt = 0;

                for (int i = 0; i < threadNum; i++) {
                    tqe[i] = new ThreadQuadraticEquation(threadNum, parameter1, parameter2);
                }
                break;
        }
    }

    public void eachThreadStartWork () {
        switch (serviceCode) {
            case ThreadCalculation.SQUARE:
                for (int i = 0; i < threadNum; i++) {
                    tRect[i].start();
                }
                break;

            case ThreadCalculation.QUADRATIC:
                for (int i = 0; i < threadNum; i++) {
                    tqe[i].start();
                }
                break;
        }
    }

    public void eachThreadWaitFinish () throws InterruptedException {
        switch (serviceCode) {
            case ThreadCalculation.SQUARE:
                for (int i = 0; i < threadNum; i++) {
                    tRect[i].join();
                }
                break;

            case ThreadCalculation.QUADRATIC:
                for (int i = 0; i < threadNum; i++) {
                    tqe[i].join();
                }
                break;
        }
    }

    public float sumEachThreadResult () {
        float sum = 0;

        switch (serviceCode) {
            case ThreadCalculation.SQUARE:
                for (int i = 0; i < threadNum; i++) {
                    sum += tRect[i].getSum();
                }
                break;

            case ThreadCalculation.QUADRATIC:
                for (int i = 0; i < threadNum; i++) {
                    sum += tqe[i].getSum();
                }
                break;
        }

        return sum;
    }

    public float calcArea () throws InterruptedException {
        eachThreadStartWork();
        eachThreadWaitFinish();
        return sumEachThreadResult();
    }
}
