import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Test> test = new HashMap<>();

        // put을 통해서 Map(key, value) 형식으로 저장이 가능하다.
        // 즉 key값 1에 new Test()로 만들어진 객체가 value로서 저장된다.
        test.put(1, new Test());
        // key값 2에 new Test() 객체가 저장
        test.put(2, new Test());
        test.put(3, new Test());

        System.out.println(test);

        // 특정 key의 내용을 삭제한다.
        test.remove(2);

        System.out.println("remove() 이후: " + test);

        // put()의 또 다른 특성중 하나로
        // 같은 key에 값을 새롭게 넣게 되면
        // 내용을 덮어쓰게 된다.
        test.put(3, new Test());

        // get()을 통해 특정 key값의 내용물을 가져올 수 있다.
        System.out.println("put() 이후 test.get(3): " + test.get(3));

        // Map.Entry 파트는 실제 key 값과 value 값을 분리하기 위해 항상 동일한 패턴으로 사용하는 녀석들이다.
        // 즉 Map에서 key 값과 value 값을 따로 분리하고자 할 때 사용하면 된다.
        // test(Map의 객체)로 test.entrySet을 하면 Map.Entry 형태를 얻게 된다.
        for (Map.Entry<Integer, Test> t: test.entrySet()) {
            // getKey()는 key 값을 획득
            Integer key = t.getKey();
            // getValue()는 말 그대로 value 값을 획득
            Test value = t.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
