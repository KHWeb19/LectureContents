public class Test {
    int num1;
    int num2;
    static int cnt = 0;

    public Test () {
        num1 = 3 + cnt;
        num2 = 7 + cnt++;
    }

    @Override
    public String toString() {
        return "Test{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
