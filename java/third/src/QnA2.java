public class QnA2 {
    public static void main(String[] args) {
        //정수형 변수 2개 만들기
        // Q. 정수형 변수를 랜덤으로 돌리려고 하는데 값이 0으로만 떨어짐
        //    처음엔 (int)를 빼고 했는데 에러가 발생
        //    그래서 (int) 추가 후 에러는 발생 하지 않음
        //    최소값 지정 1로 하였지만 랜덤값 변함 없음
        
        /* A.
              Math.random()은 0.0 ~ 1.0 미만의 double 값을 리턴함
              그러므로 int 캐스팅을 하면 항상 0을 리턴함
              만약 숫자값을 나오게 하고 싶다면 숫자를 곱해야함
              
              0.0 ~ 1.0 x 특정값 = 0.0 ~ 특정값 미만
              위와 같은 범주를 가지게 되므로 랜덤값을 만들게됨
              
              그러나 0.0 ~ 1.0 미만 + 1은 언제나 1만 리턴함
         */
        int a1 = (int)Math.random();
        int a2 = (int)Math.random();

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

        a1 = (int)(Math.random() * 6 + 1);
        a2 = (int)(Math.random() * 12 + 1);

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
    }
}
