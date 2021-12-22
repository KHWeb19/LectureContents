public class JavaVariable {
    public static void main(String[] args) {
        // Java에서 변수를 만드는 방법
        // 1. 데이터타입(자료형)을 적는다.
        // 2. 변수 이름을 작성한다.
        // 3. 필요하다면 = 3 등을 통해서 값을 할당한다. (있어도 그만 없어도 그만)

        // 데이터타입이란 ?
        // 정수형: int (4byte), 실수형: float, double
        // float은 4byte, double은 8byte

        // byte 개념은 ?
        // 1byte = 8bit

        // bit 개념은 ?
        // 컴퓨터에서 가장 작은 저장 단위로 0 혹은 1을 저장할 수 있음
        // 1byte - 8bit

        // 1bit는 몇 개의 숫자를 표현할 수 있을까 ?
        // 0, 1 - 2개

        // 2bit는 ?
        // 00, 01, 10, 11 - 4개

        // 3bit는 ?
        // 000, 001, 010, 011, 100, 101, 110, 111 - 8개

        // 4bit는 ?
        // 0000, 0001, 0010, 0011, 0100, 0101, 0110, 0111,
        // 1000, 1001, 1010, 1011, 1100, 1101, 1110, 1111 - 16개
        
        // 5bit ... 32bit(4byte)
        // 2^32 = 42억 9천만

        // 큰손들은 기본이 100억 단위로 움직이는데
        // 뱅킹 솔루션이 42억 9천만이 제한이다 ???
        // 말도 안되니까 BigInteger라는
        // 매우 큰 숫자를 처리할 수 있는 별도의 데이터타입도 존재함

        // 데이터타입에 숫자 제한이 걸리는 이유는 결국 비트 시스템 때문이다.

        int num;

        num = 3;

        // println()과 printf()의 차이점
        // print가 들어가면 전부 출력
        // ln이 들어있으면 자연로그 ln이 아니고 자동 앤터(개행)
        // f가 들어있으면 포맷 형식을 지정할 수 있음
        
        // 포맷 형식을 지정한다는 것은 무슨 뜻인가 ?
        // 포맷 == 양식
        // 특정 양식을 지정하고 그 양식에 적합한 출력을 생성해준다는 뜻
        
        // %d - 정수 출력
        // %lf - float, double 소수점 출력
        // %s - 문자열
        // 문자열은 반드시 쌍따옴표로 감싸줘야함
        // ex) "test 는 문자열이 아님
        //     "test hi hi hello dfjsk    "는 문자열임

        // \n은 개행 문자로 앤터와 같은 역할을 한다.
        System.out.println("숫자 = " + num);
        System.out.printf("포맷 지정 숫자 = %d\n", num);
    }
}

// * 프로젝트 생성하는 방법
// * git에 PR 넣기
// * git 작업시 주의할 사항들 정리해보기
// * 기타 복습