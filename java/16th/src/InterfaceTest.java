public class InterfaceTest {
    public static void main(String[] args) {
        JavaStrcmp js1 = new JavaStrcmp(107.3);
        JavaStrcmp js2 = new JavaStrcmp(33.7);

        if (js1.compareTo(js2) > 0) {
            System.out.println("js1이 js2 보다 더 크다.");
        } else if (js1.compareTo(js2) < 0) {
            System.out.println("js1이 js2 보다 더 작다.");
        } else {
            System.out.println("js1과 js2의 크기는 같다.");
        }
    }
}
