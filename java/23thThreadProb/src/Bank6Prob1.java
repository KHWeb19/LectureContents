public class Bank6Prob1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. 가로 길이 2, 세로 길이 2인 사각형의 넓이는 ?
        사각형 넓이이니 모두들 면적값이 4
        검토에 활용
        
        1-1. 가로 길이 2를 아주 작은값인 0.001로 나눈다
        1-2. 나누면 아주 작은값인 0.001이 몇 개 생성되는가
        1-3. 이 아주 작은 밑변과 높이값인 2를 곱해 작은 면적값 파악
        1-4. 각각의 모든 작은 사각형들을 합산하여 4에 근접하는지 파악
         */

        ThreadRectangle.calcEachThreadTotal();

        ThreadRectangle[] rect = new ThreadRectangle[ThreadRectangle.THREAD_MAX];

        // 스레드 준비
        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++)
        {
            rect[i] = new ThreadRectangle();
        }

        // 스레드 구동
        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++)
        {
            // run()으로 구동되면 Thread가 관장하는 제어권에서 제어되지 않음
            //rect[i].run();
            // start()로 구동하면 Thread 상에서 Context Switching을 통한 경쟁이 활성화됨
            rect[i].start();
        }

        /*
        rect[0].start();
        rect[1].start();
        rect[2].start();
        rect[3].start();
         */

        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++) {
            rect[i].join();
        }
        // test 구동 (컴퓨터 세계의 오차의 모순을 확인)
        //rect[0].run();
        System.out.printf("%d개의 스레드가 모든 작업을 완료하였습니다.", ThreadRectangle.THREAD_MAX);

        float finalResult = 0;

        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++) {
            finalResult += rect[i].getSum();
        }

        System.out.println("최종 결과는 ? " + finalResult);
    }
}
