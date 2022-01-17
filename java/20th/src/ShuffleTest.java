import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        while (true) {
            Collections.shuffle(list);
            System.out.println(list);
            Thread.sleep(1000);
        }
    }
}
