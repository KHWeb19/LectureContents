import java.math.BigInteger;
import java.util.Vector;

public class JavaVectorObjectTest {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();

        v.addElement(new Character('A'));
        v.addElement(new String("내맴대로 ~"));
        v.addElement(new Integer(77));
        v.addElement(new BigInteger("333"));

        System.out.println("Vector 크기: " + v.size());

        // insertElementAt()의 역할
        // 인덱스 1번에 데이터를 집어넣고 해당 자리에 있던 애들을 뒤쪽으로 보냄
        v.insertElementAt(new Float(3.141592), 1);
        System.out.println("insertElementAt() 이후 크기: " + v.size());

        // setElementAt()의 역할
        // 특정 인덱스의 데이터(값)만 변경한다.
        v.setElementAt("요런것도 되니 ?", 3);
        System.out.println("setElement() 이후 크기: " + v.size());

        System.out.printf("v의 0번째: %c\n", (Character) v.elementAt(0));
        System.out.printf("v의 1번째: %f\n", (Float) v.elementAt(1));
        System.out.printf("v의 2번째: %s\n", (String) v.elementAt(2));
        System.out.printf("v의 3번째: %s\n", (String) v.elementAt(3));
        System.out.printf("v의 4번째: %d\n", (BigInteger) v.elementAt(4));

        // remove()의 역할
        // 특정 인덱스의 데이터를 지운다.
        v.remove(0);

        System.out.printf("v의 0번째: %f\n", (Float) v.elementAt(0));
        System.out.printf("v의 1번째: %s\n", (String) v.elementAt(1));
        System.out.printf("v의 2번째: %s\n", (String) v.elementAt(2));
        System.out.printf("v의 3번째: %d\n", (BigInteger) v.elementAt(3));
    }
}
