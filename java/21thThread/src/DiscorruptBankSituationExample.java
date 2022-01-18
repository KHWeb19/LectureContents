import java.math.BigInteger;

class AccountClient1 extends Thread {
    public void run () {
        for (int i = 0; i < 100; i++) {
            DiscorruptBankSituationExample.db.depositMoney(new BigInteger("10000000000"));
            System.out.println("depositMoney(100,0000,0000): " + DiscorruptBankSituationExample.db.getMoney());
        }
    }
}

class AccountClient2 extends Thread {
    public void run () {
        for (int i = 0; i < 100; i++) {
            DiscorruptBankSituationExample.db.withdrawMoney(new BigInteger("10000000000"));
            System.out.println("withdrawMoney(100,0000,0000): " + DiscorruptBankSituationExample.db.getMoney());
        }
    }
}

public class DiscorruptBankSituationExample {
    public static DiscorruptBank db = new DiscorruptBank();

    public static void main(String[] args) {
        AccountClient1 ac1 = new AccountClient1();
        AccountClient2 ac2 = new AccountClient2();

        // 입금
        ac1.start();
        // 출금
        ac2.start();
    }
}

// 정상적인 상황이라면 입출금을 같은 비율로 같은 횟수 진행했기 때문에
// 원금이 유지되어야만 하는 상황이다.
// 그러나 결과는 보편적으로 폭망하는 상황을 연출하고 있다.
// 아주아주 간혹 ? 이득을 보는 경우도 있다.
// 이러한 상황 자체가 굉장히 큰 문제라는 것이다.
// 이를 해결하기 위해 우리는 Thread에서 다루는
// Critical Section과 Synchronization(동기화) 메커니즘들에 대한 추가 학습이 필요하다.