public class MyCustomSequenceTest {
    public static void main(String[] args) {
        int[] arr = { 1, 1 };

        MyCustomSequence mcs = new MyCustomSequence(arr, 0);
        System.out.println("20번째 데이터 = " + mcs.getNthOrderData(20));

        int[] arr2 = { 1, 1, 1, 2 };

        MyCustomSequence mcs2 = new MyCustomSequence(arr2, 1);
        System.out.println("25번째 데이터 = " + mcs2.getNthOrderData(25));

        MyCustomSequence mcs3 = new MyCustomSequence(arr, 0, 0);
        System.out.println("20번째 데이터 = " + mcs3.getNthOrderData(20));

        int[] arr3 = { 1, 1, 1 };

        MyCustomSequence mcs4 = new MyCustomSequence(arr3, 0, 1);
        System.out.println("25번째 데이터 = " + mcs4.getNthOrderData(25));

        // 이를 통해 1번째 방식과 2번째 방식 모두 MyCustomSequence로 깔끔한 처리가 가능함을 입증!
        // 완료!

        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        // 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...

        //  1  +  1  =  2
        // [0] + [1] = [2]
        //  1  +  1  +  1  =  3  or  1  +  1  =  2
        // [0]   [1]   [2] = [4] or [0]   [2] = [3]

        //  1  +  2  =  3
        // [1] + [2] = [3]
        //  1  +  1  +  2  =  3  or  1  +  2  =  3
        // [1]   [2]   [3] = [5] or [1]   [3] = [4]
        
        // 현재 2개의 정보 집합을 분석해보면 아래와 같은 결론을 얻을 수 있다.
        // 1. 순차적 정보를 결합하여 정보를 획득하는 방식이 있음
        // 2. 같은 횟수의 데이터를 결합하여 정보를 획득하는 방식이 있음
        
        // 이 상황을 모두 만족하며 코드를 작성하기 위해서는
        // 별도의 도움을 줄 수 있는 클래스가 필요하다는 판정을 내릴 수 있게 됨

        // 1번 방식
        // 초기 셋팅
        // [0] + [1] + [2] = [4] 가 나오는 케이스라 보정치(1)가 추가되어야함
        // 배열: 1, 1, 1, 2
        // 길이: 4
        // 초기 셋팅
        // [0] + [1] = [2] 가 나오는 케이스는 보정치가 필요 없음
        // 배열: 1, 1
        // 길이: 2
        
        // * 보정치: 순차적으로 더하다가 연결되지 않는 경우
        // * 점핑: 순차적으로 더하지 않고 몇 개 건너뛰고 처리하는 경우

        // 2번 방식
        // 초기 셋팅
        // [0] + [2] = [3]이 나오는 케이스이므로 보정치가 필요 없음
        // 주의 사항: 보정치는 필요 없지만 하나를 건너 뛰어야한다는 부분이 존재함
        //           (우리 커스텀 수열 용어에서는 점핑이라 표기하도록 한다) - 점핑(1)
        // 배열: 1, 1, 1
        // 길이: 3
        // 초기 셋팅
        // [0] + [1] = [2]가 나오는 케이스는 보정치 필요 없음
        // 배열: 1, 1
        // 길이: 2

        // 정수형 배열, 길이, 보정치(BIAS), 점핑
    }
}
