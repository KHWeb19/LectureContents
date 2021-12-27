public class ArrayTest {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] arr = new int[MAX];

        // 배열을 만드는 방법
        // 1. 데이터 타입을 적는다.
        // 2. [] 대괄호를 열고 닫는다.
        // 3. 배열의 변수 이름으로 사용할 이름을 적는다.
        // 4. 메모리 공간을 할당해준다.
        //    4-1. new를 적는다.
        //    4-2. 할당하고자 하는 메모리 데이터 타입을 적어준다.
        //    4-3. 할당할 개수를 [] 대괄호 내부에 적어준다.

        // 배열은 for문과 궁합이 아주 좋다.
        // 현재 arr라는 배열은 아래와 같은 형식으로 구성된다.
        
        // [1] [2] [3] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] arr
        //  0   1   2   3   4   5   6   7   8   9  10  11  12
        // 여기 0부터 써있는 숫자가 바로 arr[0], arr[1] 을 의미하는 숫자들임
        for (int i = 0; i < MAX; i++) {
            arr[i] = i + 1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
