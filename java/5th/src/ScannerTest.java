import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        // Scanner는 Class 타입의 데이터 타입
        // 아직 클래스를 모르므로 입력을 수행하기 위해 존재하는 데이터 타입이라고 생각하자.
        // new Scanner(System.in)은 시스템으로
        // 입력 들어가는 정보를 해석하겠다 정도로 받아들이면 되겠다.
        // 스캐너 쓸 때 다른 방법은 없나요 ? 이거 말고 안쓴다고 보면 됩니다.
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력해보세요: ");
        // scan.nextInt()를 통해서 정수를 입력 받을 수 있게 도와준다.
        int num = scan.nextInt();
        // float 타입이라면 ? scan.nextFloat()
        // double 이라면 ? scan.nextDouble()

        System.out.println("당신이 입력한 정수는 " + num);
    }
}
