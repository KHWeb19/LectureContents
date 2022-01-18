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
