public class JavaStrcmp implements Comparable {
    private double doubleNum = 0;

    // 같은 이름일 때 주의합시다!
    // 지금처럼 요상한 문제가 발생합니다!
    public JavaStrcmp (double doubleNum) {
        this.doubleNum = doubleNum;
    }

    // 현재 예제상 interface를 활용한 비교 방식을 봤다.
    // 근대 이렇게 만들 필요가 있나 ?
    // 오히려 더 복잡해보인다고 생각할 수 있다 <<< 맞다.

    // 현재 입력은 같은 JavaStrcmp에 해당한다.
    // 그리고 실제로 숫자를 그냥 비교하면 되는데 불편하게 Object를 사용하고 있다.
    // 만약에 정말로 객체간 비교를 해야 하는 상황이 존재한다면 어떻게 해야할까 ?
    // 예를 들어서 v1 = (4, 5) 이란 정보와 v2 = (6, 2)이란 정보가 있다.
    // 이런 경우에도 일관되게 compareTo로 두개를 비교할 수 있는 방법이 있을까 ?

    // 추상화 vs 비추상화
    // 대각선 길이를 구하도록 프로그래밍 하는 경우(초기에는 필요)
    // 그러나 이후에도 매번 그래야 한다면 ???
    // 이제는 3차원 지도를 사용하겠다 v1 = (4, 5, 1) 형식이 된다면 ?
    // v1.compareTo(v2) <<<--- 어떤 경우든 이런식으로 커버할 수 있게 만든다면 편리하다.
    // 즉 사용자가 내부의 세부 사항을 몰라도 활용이 가능해진다는 이점이 있다 (추상화 증대)

    // 자 그럼 여기서 바로 interface가 필요한 이유가 등장한다.
    // 대표적으로 주문하기에 해당한다.
    // 1. 옷가게의 물건을 주문한다.
    // 2. 음식점의 음식을 주문한다.
    // 3. 어떤 전자 제품을 주문한다.
    // 4. ~~~을 주문한다.
    // 주문의 종류가 엄청 다양한데 ??????

    // 주문이라는 사항은 모두 동일하지만
    // 각각 처리해야 하는 세부사항이 모두 다릅니다.
    // 1번의 프로세스
    // 창고에서 품질 관리 등등 -> 포장 -> 배송
    // 2번의 프로세스
    // 재고 확인 -> 손질 -> 조리 시작 -> 배송
    // 3번의 프로세스
    // 부품 및 재고 확인 -> 불량 검사 -> 포장 -> 배송
    // 4번 등등 ...

    // 분명 주문이라는 통합 시스템으로 관리해야 하는 것은 맞으나
    // 자세히 들여다 보면 각각의 세부사항들이 다르다.
    // 그렇기 때문에 이름은 동일하되
    // 기능을 자유롭게 변경할 수 있는 interface를 사용하는 것이 좋다.
    @Override
    public int compareTo(Object otherObject) {
        JavaStrcmp other = (JavaStrcmp) otherObject;

        if (this.doubleNum < other.doubleNum) {
            System.out.println("입력이 더 크다.");
            return -1;
        } else if (this.doubleNum > other.doubleNum) {
            System.out.println("입력이 더 작다.");
            return 1;
        } else {
            System.out.println("두 개는 같다.");
            return 0;
        }
    }
}
