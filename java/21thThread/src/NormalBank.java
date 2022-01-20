import java.math.BigInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NormalBank {
    private static BigInteger money;
    private Lock lock;

    public NormalBank () {
        money = new BigInteger("10000000000");
        // 요놈이 아까 이론 설명에서 얘기 했던 베리어(방어막)
        lock = new ReentrantLock();
    }

    public void deposit () {
        try {
            // 베리어 활성화
            lock.lock();
            money = money.add(new BigInteger("1000000000"));        // 방어해야할 대상
            System.out.println("현재 금액: " + money);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {     // finally는 catch에 걸리던 별 이상이 없던 무조건 실행하는 루틴임(맨 마지막에)
            // 베리어 해제
            lock.unlock();
        }
    }
    public void withdraw () {
        try {
            // 베리어 활성화
            lock.lock();
            money = money.subtract(new BigInteger("1000000000"));        // 방어해야할 대상
            System.out.println("현재 금액: " + money);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {     // finally는 catch에 걸리던 별 이상이 없던 무조건 실행하는 루틴임(맨 마지막에)
            // 베리어 해제
            lock.unlock();
        }
    }
    public static BigInteger getMoney() {
        return money;
    }
}

// Q: 스레드의 실행 순서를 정할 순 없는가 ?
// A: 설명을 위해 부연 설명이 좀 필요함
// 인공위성은 인터럽트가 0.0001초마다 발생한다고 보면됨
// 처리를 빨리 해줘야함
// 문제는 인터럽트를 감지하고 인터럽트 처리하는 것을 돌리기엔 시간이 턱 없이 부족함
// Bottom Half를 도입해서 인터럽트가 발생하면
// 이것을 Queue 라는 공간에 쌓아놓음
// Queue는 선입선출 구조(먼저 들어온놈이 먼저 실행된다라는 철학을 가짐)
// 너무 빈번하니 즉각적인 처리가 불가하므로
// Queue에 순서대로 받아놓고 여유가 생기면 이 Queue에 쌓여 있는 정보를 처리함
// 결론: 이 구조를 설계하여 만들면 순차적인 스레드 처리가 가능해짐