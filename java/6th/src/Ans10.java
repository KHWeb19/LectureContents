public class Ans10 {
    public static void main(String[] args) {
        final int APPLE_NUM = 5;
        final int MANDARIN_NUM = 3;
        final int ORANGE_NUM = 5;
        final int WATERMELON_NUM = 2;
        final int MELON_NUM = 3;
        final int GRAPE_NUM = 4;

        final int APPLE_IDX = 0;
        final int MANDARIN_IDX = 1;
        final int ORANGE_IDX = 2;
        final int WATERMELON_IDX = 3;
        final int MELON_IDX = 4;
        final int GRAPE_IDX = 5;

        final int TOTAL = 6;

        int[] kindsOfFruit = new int[TOTAL];
        int[] numOfFruit = new int[TOTAL];

        // 사실 지금은 각 인덱스를 지정해서 값을 부여했다만
        // 실제 사용자는 랜덤하게 물품을 고르게됨
        // 그리고 매장에서 관리하는 물품은 시장 상황에 따라 추가될 수도 줄어들 수도 있음
        // 그러므로 지금처럼 IDX를 고정시킬 수 없기도함
        // 그렇기 때문에 실제로는 사용자가 선택했을때 그 값을 랜덤하게 셋팅하게 만들어줘야함
        // 근대 그러면 문제가 너무 어려워져서 좀 쉽게가져가게 하려고 했음
        // 그래서 인덱스 값을 고정했는데
        // 이 고정된 값 자체가 실제 사용자가 고른 품목이라고 생각하면 되겠음
        // 또한 고른 품목의 가격은 얼마인지 알 수 있으니 그 가격이 책정되었다고 보면 됨
        kindsOfFruit[APPLE_IDX] = 1000;
        kindsOfFruit[MANDARIN_IDX] = 500;
        kindsOfFruit[ORANGE_IDX] = 2000;
        kindsOfFruit[WATERMELON_IDX] = 10000;
        kindsOfFruit[MELON_IDX] = 5000;
        kindsOfFruit[GRAPE_IDX] = 3000;

        // 실제 위에서 사용자가 고른 정보가 배치되고
        // 이 물품을 몇 개 고른지 기록하는 상황임
        numOfFruit[APPLE_IDX] = APPLE_NUM;
        numOfFruit[MANDARIN_IDX] = MANDARIN_NUM;
        numOfFruit[ORANGE_IDX] = ORANGE_NUM;
        numOfFruit[WATERMELON_IDX] = WATERMELON_NUM;
        numOfFruit[MELON_IDX] = MELON_NUM;
        numOfFruit[GRAPE_IDX] = GRAPE_NUM;
        
        // 이 배열 두 개의 정보를 모두 가지고 있으면 영수증이 만들어짐
        // 파악해야할 사항이라면 지금 APPLE_IDX라고 적어놓은 사항이
        // 향후에는 랜덤하게 들어갈 수 있다는 것을 기억해야함
        // [0] = 3, [1] = 5, [2] = 10
        // 즉 3번 항목, 5번 항목, 10번 항목이 선택되었음을 의미
        int sum = 0;

        for (int i = 0; i < TOTAL; i++) {
            sum += kindsOfFruit[i] * numOfFruit[i];
        }

        System.out.println("전체 합산가: " + sum);
    }
}
