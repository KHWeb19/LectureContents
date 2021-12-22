public class FloatDoublePrint {
    public static void main(String[] args) {
        float fnum1 = 3.3f;
        double fnum2 = 7.7;
        // float은 숫자에 f를 붙여서 float 타입임을 명시함

        System.out.println("요런게 편해요 - fnum1: " + fnum1);
        System.out.println("요런게 편해요 - fnum2: " + fnum2);

        System.out.printf("얜 타입을 알아야함 - fnum1: %f\n", fnum1);
        System.out.printf("얜 타입을 알아야함 - fnum2: %f\n", fnum2);

        System.out.println("하지만 요런식으로 정밀 제어가 가능함");
        System.out.printf("얜 타입을 알아야함 - fnum1: %.2f\n", fnum1);
    }
}

// Q. 앞에 float이 붙었는데 뒤에 f가 필요한 이유는 뭘까요 ?
// A.
/*
변수란 무엇인가 ?
1) 변하는 수: 30%
2) 메모리 공간: 90%
3) 값을 저장하는 공간: 70%

특정 데이터타입의 정보를 저장할 수 있는 메모리 공간 - C
특정 데이터타입의 정보를 저장할 수 있는 공간 - Java

이사갈려면 ? 우리가 사용하는 물건을 박스에 넣고 포장함
박스 개념이 변수임

박스에 넣는 내용은 '= 3' 과 같은 형식에 정보(실제 내용)임
현실에서는 박스에 넣고 싶은대로 막 넣을 수 있다.
그러나 컴퓨터에서 박스 개념은 조금 다르다.
특정한 형태의 것을 넣을 수 있도록 만들어져 있다. (포함 개념도 존재하긴함)
float 타입의 경우엔 소수점이고 double도 소수점이다.
그러나 float은 4byte, double은 8byte다.
벌써 이 둘의 크기가 어떤가 ? 다름

float에 double을 집어넣을 수 있을까 ? (포함 관계 때문에 넣을 수는 있음)
근대 double의 타입이 float으로 강제로 바뀜
여기서 float 타입은 숫자가 어떻게 표기되고
double 타입은 숫자를 어떻게 표기하는지 알 필요가 있다.

float 타입은 f를 붙이게 되어 있음
double은 붙이지 않음
 */

// Q. 소수점 제어를 하고자 할때 그냥 올 double을 써도 되는가 ?
// A. 사용하는데 문제는 없음
//    그러나 성능은 float 보다 떨어지며 정밀도는 float 보다 높음