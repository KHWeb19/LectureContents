public class MyCustomDataTypeTest {
    public static void main(String[] args) {
        // 정수형 변수 1개, float 변수 2개, double 변수 3개에 아무 값이나 할당하고 출력합니다.
        // 이 문제는 생성자 + 함수 덮어쓰기를 함께 활용하면 효율적으로 만들 수 있다.

        // 첫번째는 정수형 개수
        // 두번째는 float 개수
        // 세번째는 double 개수를 입력하도록 설정

        // 여태까지 객체화하는 작업이 new 클래스명()으로 알고 있었을 것이다.
        // 실제로 객체화 하는 작업이 맞고 이를 수행할때 생성자라는 녀석이 동작하게 된다.
        // 생성자는 아래와 같이 매서드처럼 입력을 전달 받을 수 있다.
        MyCustomDataType mcdt = new MyCustomDataType(1, 2, 3);
        MyCustomDataType mcdt2 = new MyCustomDataType(1, 2f, 3.0);
        MyCustomDataType mcdt3 = new MyCustomDataType();

        mcdt.allocRandom();
        System.out.println(mcdt);

        MyCustomDataType mcdt4 = new MyCustomDataType(2, MyCustomDataType.INT_PROC);
        mcdt4.allocIntRandom();
        System.out.println(mcdt4);

        MyCustomDataType mcdt5 = new MyCustomDataType(2, MyCustomDataType.FLOAT_PROC);
        mcdt5.allocFloatRandom();
        System.out.println(mcdt5);

        MyCustomDataType mcdt6 = new MyCustomDataType(2, MyCustomDataType.DOUBLE_PROC);
        mcdt6.allocDoubleRandom();
        System.out.println(mcdt6);
    }
}
