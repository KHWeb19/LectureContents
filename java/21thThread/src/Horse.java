import java.util.Random;

public class Horse implements Runnable {
    private String horseName;
    private int waitingTime;
    // Random을 만드는 또 다른 방법중 하나인 Random 클래스
    private final static Random generator = new Random();

    public Horse (String name) {
        horseName = name;
        // nextInt(범주)는 0 ~ 7777 - 1 까지
        // 즉 7777은 개수를 의미함
        // 예로 10 ~ 7777을 표현하고 싶다면
        // 0 ~ 7767 ---> nextInt(7768) + 10;
        // 조금 더 쉽게 접근한다면 기존 Math.random()에 사용했던 range를 bound에 넣어도 된다.
        waitingTime = generator.nextInt(7777) + 7777;
    }

    // Runnable이라는 interface를 implements 한 내용임
    // run()은 스레드라는 녀석이 구동시킬 매서드
    @Override
    public void run() {
        // try {} catch {} 부분은 이렇게 생각하면 된다.
        // try 내에서 동작하는 코드가 문제를 유발시키면
        // catch 쪽에서 어떤 문제가 있는지 출력하는 구조다.
        // (뭔가 문제가 있지 않은 이상 try 부분만 실행됨)
        try {
            Thread.sleep(waitingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(horseName + "가(이) 경주를 완료하였습니다!!!");
    }
}
