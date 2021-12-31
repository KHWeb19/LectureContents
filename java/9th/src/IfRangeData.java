import java.util.Scanner;

public class IfRangeData {
    public static void main(String[] args) {
        boolean checkNotFinish = true;

        Scanner scan = new Scanner(System.in);
        int num;

        while (checkNotFinish) {
            System.out.print("성적 입력: ");

            num = scan.nextInt();

            if (num == -1) {
                System.out.println("입력 종료!");
                break;
            }

            // 이런 혼선을 최소화하고자 한다면
            // 가장 협소한 범주를 가장 위에 배치한다.
            // 가장 넓은 범주는 최하위에 배치한다.
            // (가장 넓은 범주가 막말로 개나소나 다 할테니까)
            if (num >= 90) {
                System.out.println("A 등급");
            } else if (num >= 80) {     // 90 > num >= 80
                System.out.println("B 등급");
            } else if (num >= 70) {     // (90 > num | 80 > num) >= 80
                System.out.println("C 등급");
            } else if (num >= 60) {
                System.out.println("D 등급");
            } else {
                System.out.println("빵야 빵야!");
            }
        }
    }
}
