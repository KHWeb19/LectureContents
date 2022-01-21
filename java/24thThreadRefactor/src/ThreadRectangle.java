// Common: 공통
public class ThreadRectangle extends ThreadCommon {
    // 1. main()쪽에서 ThreadRectangle tRect = new ThreadRectangle();
    //    tRect.calcArea(범위); 형식으로 처리하는 것을 원함
    // 2. ThreadRectangle 생성자가 구동될 때
    //    사용자가 요청한 스레드 개수만큼 스레드를 처리할 배열을 만들어야 한다.
    // 3. 이렇게 정리를 해놓고보니 가독성이 떨어지는 부분이 어딘가 ?

    // 이걸 몇 개의 Thread로 연산할거니 ?
    // 에 대한 답을 받아오도록 설계한다.
    public ThreadRectangle (int threadNum, int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        for (int i = xStart[localThreadId]; i <= xEnd[localThreadId]; i++) {
            sum += dx * y;
            System.out.printf("Thread ID = %d, sum = %.12f\n", localThreadId, sum);
        }

        System.out.printf("sum = %.12f\n", sum);
    }
}
