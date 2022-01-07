public class Employee {
    float payment;
    // 1 ~ 10% --> 1.00 ~ 10.00
    float[] incRatio;

    final int MIN = 100;
    final int MAX = 1000;

    final float BIAS = 100.0f;

    int range;

    public Employee (final float firstPay) {
        payment = firstPay;

        range = MAX - MIN + 1;
    }

    public void allocIncRatio (int year) {
        incRatio = new float[year];

        for (int i = 0; i < year; i++) {
            incRatio[i] = ((int) (Math.random() * range + MIN)) / BIAS;
            // System.out.printf("incRatio[%d] = %.2f\n", i, incRatio[i]);
        }
    }

    public void calcPayment (int year) {
        for (int i = 0; i < year; i++) {
            // payment = payment + payment * incRatio[i] / BIAS;
            payment += (payment * incRatio[i] / BIAS);
        }

        System.out.printf("5년후의 연봉 = %d\n", (int)payment);
    }
}
