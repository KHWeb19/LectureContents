import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList를 만드는 방법
        // ArrayList를 적고 <> 꺽쇠 내부에 다룰 데이터 타입을 작성한다.
        // 우리는 문자열을 다룰 생각이라 String을 넣었다.
        // 데이터 타입 <<<<---- 을 넣어도 된다고 했으니 어떤 것도 들어갈 수 있다 ?
        ArrayList<String> list = new ArrayList<>();

        // add(x): 그냥 현재 위치에서 순차적으로 값이 입력됨
        //        현재 위치란 처음엔 0, 그다음엔 1, 그 다음은 2
        //        이와 같이 순차적인 구조를 의미함
        list.add("우유");
        list.add("계란");
        list.add("버터");
        // add(x, y): x 인덱스에 y값을 넣는 형식임
        //            즉 특정한 위치에 값을 넣을수가 있음
        list.add(1, "사과");
        list.add(2, "파인애플");
        list.add(4, "포도");
        
        // size(): ArrayList의 길이를 알려줌
        for (int i = 0; i < list.size(); i++) {
            // get(x): x 인덱스의 정보를 출력함
            System.out.println(list.get(i));
        }

        System.out.println("\n이제 3번 인덱스를 삭제합니다!");

        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
