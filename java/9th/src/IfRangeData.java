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

            if (num >= 90) {
                System.out.println("A 등급");
            } else if (num >= 80) {
                System.out.println("B 등급");
            } else if (num >= 70) {
                System.out.println("C 등급");
            } else if (num >= 60) {
                System.out.println("D 등급");
            } else {
                System.out.println("빵야 빵야!");
            }
        }
    }
}
