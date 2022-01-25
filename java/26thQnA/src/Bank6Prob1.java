import java.sql.SQLOutput;

public class Bank6Prob1 {
    public static void main(String[] args) throws InterruptedException {

        ThreadRectangle.calEachThread();

        ThreadRectangle[] rect = new ThreadRectangle[ThreadRectangle.THREAD_MAX];

        //스레드 준비

        for(int i = 0; i < ThreadRectangle.THREAD_MAX; i++){
            rect[i] = new ThreadRectangle();
        }
        //스레드 구동
        for(int i = 0; i < ThreadRectangle.THREAD_MAX; i++){
            rect[i].start();
            rect[i].join();
        }
        // for(int i = 0; i < ThreadRectangle.THREAD_MAX; i++){
        //   rect[i].join();
        //}
        System.out.printf("%d개의 스레드가 모든 작업을 완료하였습니다.\n", ThreadRectangle.THREAD_MAX);
        float finalResult = 0;
        for(int i = 0; i < ThreadRectangle.THREAD_MAX; i++){
            finalResult += rect[i].getSum();
        }
        System.out.println("최종 합산 결과는 ? " + finalResult);
    }
}