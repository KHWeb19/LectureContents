import java.util.ArrayList;

public class ArrayListClassExample {
    public static void main(String[] args) {
        final int ACCOUNT_NUM = 3;

        // OtherAdventurer 객체를 저장할 수 있는 ArrayList를 생성
        ArrayList<OtherAdventurer> advList = new ArrayList<>();

        OtherAdventurer[] advArr = new OtherAdventurer[ACCOUNT_NUM];

        for (int i = 0; i < ACCOUNT_NUM; i++) {
            advArr[i] = new OtherAdventurer();
            // 실제 ArrayList에 생성한 객체를 저장함
            advList.add(advArr[i]);
        }

        for (int i = 0; i < ACCOUNT_NUM; i++) {
            System.out.println("계정 정보를 출력합니다!");
            // 그리고 get을 통해 객체 정보를 얻어오는 것 또한 잘 됨
            System.out.println(advList.get(i));
        }
    }
}
