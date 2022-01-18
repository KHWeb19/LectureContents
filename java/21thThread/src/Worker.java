import java.math.BigInteger;

public class Worker implements Runnable {
    private NormalBank bank;
    // 참이면 예금, 거짓이면 출금
    private boolean depositOrWithdraw;
    private int count;

    public Worker (NormalBank bank, boolean dow, int count) {
        this.bank = bank;
        depositOrWithdraw = dow;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            if (depositOrWithdraw) {
                bank.deposit();
            } else {
                bank.withdraw();
            }
        }
    }
}
