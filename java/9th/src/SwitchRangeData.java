import java.util.Scanner;

public class SwitchRangeData {
    public static void main(String[] args) {
        final int EXIT = -1;
        final int SCALE_FACTOR = 10;

        boolean checkNotFinish = true;

        Scanner scan = new Scanner(System.in);
        int num, scale;

        while (checkNotFinish) {
            System.out.print("성적 입력: ");

            num = scan.nextInt();
            scale = num / SCALE_FACTOR;

            if (num == EXIT) {
                System.out.println("성적 입력 종료!");
                break;      // checkNotFinish = false로 처리해도 되며 현재는 이 시점 즉각 종료가 됨
            } else if (num > 100) {
                System.out.println("잘못된 숫자를 입력하였으니 다시 입력하세요!");
                continue;
            }

            switch (scale) {
                /* 영 할짓이 못 됨
                case 100:
                case 99:
                case 98:
                case 97:
                case 96:
                case 95:
                case 94:
                case 93:
                case 92:
                case 91:
                case 90:
                    System.out.println("A 등급");
                    break; */
                case 10:
                case 9:
                    System.out.println("A 등급");
                    break;
                case 8:
                    System.out.println("B 등급");
                    break;
                case 7:
                    System.out.println("C 등급");
                    break;
                case 6:
                    System.out.println("D 등급");
                    break;
                default:
                    System.out.println("빵야 빵야 ~");
                    break;
            }
        }
    }
}
