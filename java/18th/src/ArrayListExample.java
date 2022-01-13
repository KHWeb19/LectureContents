import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList를 만드는 방법
        // ArrayList를 적고 <> 꺽쇠 내부에 다룰 데이터 타입을 작성한다.
        // 우리는 문자열을 다룰 생각이라 String을 넣었다.
        // 데이터 타입 <<<<---- 을 넣어도 된다고 했으니 어떤 것도 들어갈 수 있다 ?
        ArrayList<String> list = new ArrayList<>();

        list.add("우유");
        list.add("계란");
        list.add("버터");
        list.add(1, "사과");
        list.add(2, "파인애플");
        list.add(4, "포도");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\n이제 3번 인덱스를 삭제합니다!");

        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
