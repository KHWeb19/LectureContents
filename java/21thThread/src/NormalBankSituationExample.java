public class NormalBankSituationExample {
    public static void main(String[] args) throws InterruptedException {
        NormalBank bank = new NormalBank();

        // Worker(예금 처리 종헙원 뽑아서 100만번 일시킴)
        Thread t1 = new Thread(new Worker(bank, true, 1000000));
        // Worker(출금 처리 종헙원 뽑아서 100만번 일시킴)
        Thread t2 = new Thread(new Worker(bank, false, 1000000));

        t1.start();
        t2.start();

        // join을 하게 되면 main 프로세스는 Thread가 끝날때까지 대기하게 된다.
        t1.join();
        t2.join();

        // 아래서 최종 결과를 확인할 것이므로 대기해야함
        // 주의: Math.random() 하듯이 static 선언은 static 형식에 맞춰서 만들자!
        // 화면에 출력하는 I/O는 속도가 느리기 때문에
        // 많은양을 화면에 출력하면 동작 속도가 현격하게 떨어진다.
        // 아래 최종 결과만 보는 경우엔 굉장히 빠르게 동작하지만
        // 각 스레드의 동작들을 출력한다면 속도가 떨어진다.
        // 현재 100만번 정도의 루프에서는 I/O 추가가 상당히 성능 저하를 유발하고 있음
        // I/O를 제거하면 여전히 빠르게 동작하는 것을 볼 수 있다.
        System.out.println("최종 결과는: " + NormalBank.getMoney());
    }
}
