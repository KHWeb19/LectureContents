import java.sql.SQLOutput;

public class ThreadRectangle extends ThreadManager {
    final int Y = 2;
    final static int X = 2;
    // 사각형은 덜 쪼갤수록 정밀도가 올라가는 현상이 발생함 (float이나 double의 오차 때문에 그럼)

    public ThreadRectangle() {
        super();
        sum = 0;
        System.out.println("ThreadRectangle()");
    }

    public static void calEachThread(){
        ThreadManager.calRectangleThreadTotal(X);
    }

    public float getSum() {
        System.out.println("getSum(): " + sum);
        return sum;
    }

    @Override
    public void run() {
        //자기 구간을 계산하도록 한다.
        float curX = xStart;
        float tmp = 0;
        for (int i = xStart; i <= xEnd; i++) {
            tmp = dx * Y;
            System.out.printf("tmp = %.12f\n", tmp);
            sum += tmp;
            //System.out.printf("sum = %.12f\n", sum);
        }
        //System.out.printf("tmp * 500 = %.12f\n", tmp * 500);
        System.out.printf("sum = %.12f\n", sum);
    }
}