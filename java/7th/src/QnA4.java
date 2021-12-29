public class QnA4 {
    public static void main(String[] args) {

        /*  아래 코드를 자바 컴파일러가 인식하는 형태는 아래와 같습니다.
            for (int i =0; i< 5; i++) {
                ;
            }

            System.out.println("5번 반복을 해야 하는데 왜 안되는거야 ?"); */

        for (int i =0; i< 5; i++);
        {
            System.out.println("5번 반복을 해야 하는데 왜 안되는거야 ?");
        }
    }
}
