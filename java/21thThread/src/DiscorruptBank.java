import java.math.BigInteger;

public class DiscorruptBank {
    private BigInteger money;

    public DiscorruptBank () {
        money = new BigInteger("100000000000");
    }
    public void depositMoney (BigInteger deposit) {
        BigInteger m = this.getMoney();
        // money = money.add(deposit);

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.setMoney(m.add(deposit));
    }
    public void withdrawMoney (BigInteger withdraw) {
        BigInteger m = this.getMoney();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.setMoney(m.subtract(withdraw));
    }

    public BigInteger getMoney() {
        return money;
    }

    public void setMoney(BigInteger money) {
        this.money = money;
    }
}
