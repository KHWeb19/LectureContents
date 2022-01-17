import java.util.HashMap;
import java.util.Map;

public class MapBasedDuplicateCheckTest {
    public static void main(String[] args) {
        // Map<key, value>
        // 실제 key로 사용되는 것들이 sample에 있는지 문자열들임
        Map<String, Integer> m = new HashMap<>();
        
        String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem", "to" };
        
        for (String s: sample) {
            // 현재 m이라는 Map에서 sample에서 하나씩 넘어온 문자열을
            // key로 검색하여 value 값을 freq에 셋팅함
            Integer freq = m.get(s);
            // 삼항 연산자
            // 질문 ? 참이면 : 거짓이면
            m.put(s, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + "개의 단어가 있습니다!");
        // m이라는 Map 객체에서 "to"라는 key값을 가진 정보가 있는지 참거짓 판정
        System.out.println(m.containsKey("to"));
        // m이라는 Map 객체가 현재 비어 있는지 참거짓 판정
        System.out.println(m.isEmpty());
        System.out.println(m);
    }
}
