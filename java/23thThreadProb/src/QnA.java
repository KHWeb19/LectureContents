import java.util.ArrayList;
import java.util.List;

public class QnA {
    public static void main(String[] args) {
        // List라는 녀석은 모든 것이 interface로 구성됨
        // ArrayList는 실제 class로 List 사항을 implements 하고 있음
        // 그러므로 생성자는 ArrayList의 사항을 활용해야 하며
        // List는 그냥 요렇게 생겼다만 알려주는 형태임
        List<String> list = new ArrayList<>();

        // 차이 없습니다.
        ArrayList<String> theOther = new ArrayList<>();

        Integer A = new Integer(77);
    }
}
