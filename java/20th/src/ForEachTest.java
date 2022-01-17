import java.util.ArrayList;

public class ForEachTest {
    public static void main(String[] args) {
        ArrayList<Test> list = new ArrayList<Test>();

        list.add(new Test());
        list.add(new Test());
        list.add(new Test());

        // 아래와 같은 형식을 foreach라고 합니다.
        // list에 들어있는 값을 하나씩 빼와서 t에 배치합니다.
        // (더 이상 list에서 가져올 수 있는 정보가 없을때까지 Loop를 돕니다)
        for (Test t: list) {
            // 그리고 출력합니다.
            System.out.println(t);
        }
    }
}
