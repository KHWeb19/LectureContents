import java.util.Vector;

public class JavaVectorTest {
    public static void main(String[] args) {
        // ArrayList 비스무리한 Vector 생성
        Vector<String> v = new Vector<>();

        System.out.println("Vector 생성 직후의 size: " + v.size());

        // Vector에 요소 추가!
        // 타입을 깔 맞춰야 하는 것은 ArrayList와 동일하다.
        v.addElement(new String("잡아"));
        v.addElement(new String("JPA"));
        v.addElement(new String("Vue"));
        v.addElement(new String("MySQL"));
        v.addElement(new String("TypeScript"));

        System.out.println("Vector에 Data 값 설정 후 size: " + v.size());

        for (int i = 0; i < v.size(); i++) {
            // elementAt(i)는 ArrayList의 get(i)와 같은 역할을 수행한다.
            String tmp = v.elementAt(i);
            System.out.println("Vector vd의 " + i + "번째: " + tmp);
        }
    }
}
