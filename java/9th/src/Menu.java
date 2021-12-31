import java.util.Scanner;

public class Menu {
    static final int SIDE_DISH_MAX = 4;
    static final int SIDE_DISH_MIN = 2;
    static final int MAIN_DISH = 2;

    private String[][] menu;
    private Scanner scan;
    private boolean initNotFinish;

    public void initMenu () {
        menu = new String[Meal.MEAL_TIME_COUNT][SIDE_DISH_MAX + MAIN_DISH];
        scan = new Scanner(System.in);

        initNotFinish = true;
        systemInit();
    }
    private void systemInit () {
        while (initNotFinish) {
            addMenu();

            System.out.print("계속 추가하시겠습니까 ? (y / n): ");

            String yOrN = scan.nextLine();
            System.out.println("yOrN = " + yOrN);

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