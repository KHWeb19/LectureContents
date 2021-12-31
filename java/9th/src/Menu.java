import java.util.Scanner;

public class Menu {
    static final int SIDE_DISH_MAX = 4;
    static final int SIDE_DISH_MIN = 2;
    static final int MAIN_DISH = 2;

    private String[][] menu;
    private Scanner scan;
    private boolean initNotFinish;

    public void initMenu () {
        // String 클래스로 구성된 이중 배열 생성 3 by 6
        //    0 1 2 3 4 5
        // 0 [][][][][][]
        // 1 [][][][][][]
        // 2 [][][][][][]
        
        // new String[3][6]의 그림은 위와 같이 나타나게됨
        // [3][6]의 뜻은 앞에있는 [3]은 큰방이 3개 있고
        // 이 큰방은 [6]개의 작은 방을 가지고 있다는 뜻으로 받아들이면 되겠음
        menu = new String[Meal.MEAL_TIME_COUNT][SIDE_DISH_MAX + MAIN_DISH];
        // 키보드 입력 준비
        scan = new Scanner(System.in);

        initNotFinish = true;
        // 객체 내부에서는 자유롭게 매서드(함수) 호출이 가능하다.
        systemInit();
    }
    private void systemInit () {
        while (initNotFinish) {
            // addMenu 매서드를 호출함(역시 객체 내부에 들어있기 때문에 가능)
            addMenu();

            System.out.print("계속 추가하시겠습니까 ? (y / n): ");

            // nextLine()을 통해서 문자열을 입력 받음
            String yOrN = scan.nextLine();
            System.out.println("yOrN = " + yOrN);

            // 문자열을 비교할 때는 관계 연산자 '==' 을 사용할 수 없다.
            // 문자열간 같은지 여부 판정은 equals()를 통해 비교한다.
            // yOrN.equals("n")은 yOrN 라는 녀석이 "n"과 동일한지 판정한다.
            if (yOrN.equals("n")) {
                initNotFinish = false;
            }
        }
    }
    public void addMenu () {
        System.out.println("초기 설정중이니 입력하실 메뉴를 넣어주세요!");

        String menuName = scan.nextLine();
        System.out.println("입력된 메뉴 = " + menuName);
    }
}

// 메뉴 추가
// 메뉴 삭제