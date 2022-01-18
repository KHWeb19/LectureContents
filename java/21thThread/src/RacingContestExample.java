public class RacingContestExample {
    public static void main(String[] args) {
        // Thread가 스레드라고 불리는 녀석이다.
        // 실제로 이 스레드라는 녀석들은 운영체제에 따라 구조가 다르다.
        // 운영체제를 신경쓰지 않고도 개발할 수 있게 잘 추상화되어 있어서 하부까지 신경쓸 필요는 없다.
        // 다만 스레드가 어떻게 동작하는지에 대한 동작 원리를 이해할 필요는 있다.

        // new Thread(스레드화시킬 클래스를 객체화하여 만들어줌)
        // 그리고 new Thread로 구동되려면
        // new Thread 내부에서 객체화할 클래스가
        // 반드시 Runnable이라는 interface를 implements 해줘야 합니다.
        Thread t1 = new Thread(new Horse("적토마"));
        Thread t2 = new Thread(new Horse("질풍마"));
        Thread t3 = new Thread(new Horse("뇌전마"));

        // 만들어진 스레드 객체는 start() 매서드에 의해 구동됩니다.
        // start()를 하는 순간 run()이 구동된다!

        // t1, t2, t3는 거의 동시에 구동됩니다.
        // 실제로 스레드는 CPU가 여러개 있으면
        // 그 여러개의 CPU에서 모두 함께 구동됩니다.
        // 학교에서 학습하는 컴퓨터 구조론에 따르면 "CPU는 한 순간에 오직 한개다"
        // Q: ??? 지금 여러개가 같이 돌고 있지 않나요 ?
        // A: CPU가 하나라고 했지 여러개라고는 안했습니다.
        // Q: CPU가 여러개면 동시에 여러개가 같이 돌 수 있나요 ?
        // A: 네

        // 실제 스레드는 CPU가 1개 있던 시절에 만들어졌다.
        // Q: ??? 어차피 CPU는 한 순간에 하나 밖에 돌리지 못하는데
        //    여기에 스레드 개념을 도입하는게 의미가 있나요 ?
        // A: Ctrl + Alt + Delete 키를 누르세요.

        // 프로세스: 프로그램 전체 (main을 포함)
        // 스레드: 프로그램의 일부 (main이 포함되지 않음)
        // 그리고 둘의 공통점은 모두 CPU상에서 구동되기 위해 메모리에 올라가 있다(적재)는 것임
        // 즉 포괄적인 범위에서는 둘 다 객체에 해당함
        t1.start();
        t2.start();
        t3.start();
    }
}
