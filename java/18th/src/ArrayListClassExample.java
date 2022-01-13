import java.util.ArrayList;

public class ArrayListClassExample {
    public static void main(String[] args) {
        final int ACCOUNT_NUM = 3;

        ArrayList<Adventurer> advList = new ArrayList<>();

        Adventurer[] advArr = new Adventurer[ACCOUNT_NUM];

        for (int i = 0; i < ACCOUNT_NUM; i++) {
            advArr[i] = new Adventurer();
            advList.add(advArr[i]);
        }

        for (int i = 0; i < ACCOUNT_NUM; i++) {
            System.out.println("계정 정보를 출력합니다!");

            System.out.println(advList.get(i));
        }
    }
}
