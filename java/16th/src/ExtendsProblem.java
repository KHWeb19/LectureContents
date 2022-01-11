public class ExtendsProblem {
    public static void main(String[] args) {
        // 주사위 게임 만들었던 내용에 상속을 도입해서 변경해봅시다!
        // 문제를 풀면서 막히는 부분을 기록하도록 합니다.
        // 뭐에서 내 사고가 멈췄는지를 알아야 합니다.
        // 영원히 멈춰 있을순 없으니까요.
        // 발전의 시작은 '내가 뭘 모르는지 파악하는 것에서부터 시작합니다'
        
        // 1. GameManager를 만들어야함
        //    게임 전체를 관장하는 녀석
        // 2. 여기서 상속을 활용한다면 기존 구조의 변경이 필요해짐
        // 3. 현재 구조에서 문제가 되는 것은
        //    GameManager가 게임 전체를 관장한다는 것이다 <<<
        //    여기서 주의해야할 부분이 바로 >>> 전체 <<< 이다.
        // 4. 만약 GameManager가 전체가 아니라 Player 개인에게 집중하는 구조라면 어떨까 ?
        // 5. 이 구조가 된다면 GameManager에게 Player를 상속할 수 있게 된다.
        // 6. 여기서 또 생각해야 하는게 Player가 Dice를 상속하면 또 지옥을 맛보게 된다.
        //    이유는 ? Dice는 2개고 Special Dice까지 있는데
        //    이것을 상속하면 GameManager가 Player를 상속하고 이거를 배열 3개짜리를 만들어서 관리해야함
        //    이것이 도대체 무슨 조화냐 ??? 끔찍한 혼종의 하모니가 됨
        //    gmArr[3][playerNum] <<< ???
        //    앞에 3은 뭐야 ? 플레이어 숫자는 알겠는데
        //    뭐 이딴 코드가 다 있지 ㄷㄷㄷ
        
        // 전체를 관리합니다 <<<--- Player가 상속됨
        // GameManager는 Player 1명 관리하고 있음
        // 전체 관리한다면서요 ?????
        // 음 그러면 GameManager[] gmArr ?????? 이런 엄청난 악수를 두게됨

        // ex) GameManager가 전부를 관리하니까 여기 매소드 내에서 전체에 적용하는 매서드를 만들었음
        //     돌렸는데 ???? 뭐지 왜 하나만 적용되는거야 ? (참고로 코드가 복잡해지고 커진 상황임)
        //     어 ??? 나중에 보니까 GameManager가 배열이였음
        //     이런 쓰읍 .............
        //     혼란이 발생하면서 이런 그냥 for 문 돌리자 <<<--- 사용하는 쪽에서
        //     혹은 다른 클래스를 하나 만들어서 거기서 처리하게 만들수도 있을것임 <<<--- 연동해서
        //     이것 저것 주먹 구구식으로 짬뽕되다가 결국 프로토스와 저그의 합체 혼종을 만들어냄
        //     문제가 터지고 ? 어 모르겠다 일단 덮자
        //     야근, 똥, 야근, 똥, 뭐가 뭔지 모르겠다 튀자

        /* 필요에 의해 DiceGame으로 옮겨서 한 층 더 추상화시킴
        final int PLAYER_NUM = 2;
        final int DICE_NUM = 2;
        // 현재 구조대로라면 GameManager는 선수 한명을 전담 관리하는 매니저 역할임
        // 그러므로 선수의 숫자만큼 Manager가 만들어져야함
        GameManager[] gmArr = new GameManager[PLAYER_NUM];

        // 아래 루프를 통해 사용자는 주사위 2개를 모두 굴렸고
        // 필요하다면 특수 주사위를 굴리는 작업까지 완료된 상태다.
        // 남은것은 각각의 결과를 적용하고 최종 정산을 하는 작업이다.
        // 그런데 이렇게 해놓고 보니 뭐가 있으면 참 좋겠다는 생각이 들지 않는가 ?
        for (int id = 0; id < PLAYER_NUM; id++) {
            gmArr[id] = new GameManager(id, DICE_NUM);
            gmArr[id].rollEveryDice();
            gmArr[id].checkSpecialDice();
            gmArr[id].rollSpecialDice();
        }
         */

        DiceGame dg = new DiceGame();

        dg.startGame();
        // 현재 모든 내용물을 toString()을 통해 간헐적으로 살펴보고 있음
        // 더 좋은 방법은 없을까 ???
        // 여기에 오늘 학습한 compareTo를 활용해보는 방식은 어떨까 ?
        System.out.println(dg);

        // 실제로 게임의 승패 판정을 어떻게 할 것인가 ?
        // dg.getResult() 형식으로 처리하면 좋을 것이다.
        // 여기서 주의해야할 사항은 dg 객체 내에는 GameManager 배열이 들어 있다는 것이다.
        // 그러므로 여기서 즉각적인 비교가 가능하다!
        dg.printResult();
    }
}
