public class QnA {
    // 1. 매서드를 세분화 할 때 매서드끼리 final 변수가 공유 되는가 ?
    //    A. 같은 클래스가 아닌 장소에서는 일반적으로 못함
    //       그러나 static이 붙으면 가능해짐

    // 2. 클래스 내부에 있는 매서드끼리는 공유가 되는가 ?
    //    A. 네 전부 공유됩니다.
    
    // 3. 클래스 내부에 static이 붙은 경우는 뭘까요 ?
    //    A. 클래스 내부 변수에 static이 붙으면 전역 변수가 됩니다.
    //       즉 어떤 클래스, 어디서든 모두 접근이 가능해짐
    //       단 사용할 때는 클래스명.변수명으로 사용해야함
    //       ex) Meal과 Menu에 보면 Meal.MEAL_TIME_COUNT를
    //           Menu에서 사용하는 모습을 볼 수 있음
}