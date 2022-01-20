public class Bank6Prob2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadQuadraticEquation.calcEachThreadTotal(0, 3);

        ThreadQuadraticEquation[] rect = new ThreadQuadraticEquation[ThreadQuadraticEquation.THREAD_MAX];

        // 스레드 준비
        for (int i = 0; i < ThreadQuadraticEquation.THREAD_MAX; i++)
        {
            rect[i] = new ThreadQuadraticEquation();
        }

        // 스레드 구동
        for (int i = 0; i < ThreadQuadraticEquation.THREAD_MAX; i++)
        {
            rect[i].run();
            rect[i].join();
        }

        System.out.printf("%d개의 스레드가 모든 작업을 완료하였습니다.", ThreadQuadraticEquation.THREAD_MAX);

        float finalResult = 0;

        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++) {
            finalResult += rect[i].getSum();
        }

        System.out.println("최종 결과는 ? " + finalResult);
    }
}

// 실제로 현재 Bank6Prob1과 Bank6Prob2를 살펴보면
// 두 개 모두 반복적인 패턴의 코드가 중복되고 있는 모습을 볼 수 있다.
// 구지 이렇게 만들어야 하는가 ? 라는 문제에서 ThreadManager를 만들어서
// 이런 중복을 없앴다면 좀 더 좋지 않았을까라는 생각을 고찰해 볼 필요가 있을 것이다.
