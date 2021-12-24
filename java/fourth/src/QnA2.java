public class QnA2 {
    public static void main(String[] args) {
        // ASCII 코드 맵핑 증명
        // 대문자: 65 ~ 90
        // 소문자: 97 ~ 122
        for (int i = 65; i <= 90; i++) {
            System.out.printf("이게 진짜 대문자야 ? %c(%d)\n", i, i);
        }

        System.out.println();

        for (int i = 97; i <= 122; i++) {
            System.out.printf("이게 진짜 소문자야 ? %c(%d)\n", i, i);
        }
    }
}
