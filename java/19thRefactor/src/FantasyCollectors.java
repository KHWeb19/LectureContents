public class FantasyCollectors {
    public static void main(String[] args) throws InterruptedException {
        RolePlayingGame rpg = new RolePlayingGame();

        // 실제 아래 상황은 매크로 사냥 상황이였지만
        // 이번 시나리오에서는 파티 멤버를 구성할 수 있도록 설정해야 하며
        // 추가적으로 구성된 파티 멤버가 레이드(보스전)를 돌 수 있도록 만들어줘야 한다.

        // 1. 일단 레이드 진입 멤버는 3명으로 제한한다. (그래야 편함 ㅋㅋㅋ)
        // 2. 캐릭터들은 5개를 구현하도록 한다.
        // 3. 기사(탱커), 위자드, 저격수, 성황, 암살자
        // 4. 파티 멤버 설정 기능 필요 (ArrayList)

        // 5. 레이드 보스 설정 (hp, mDef, pDef, agi, men, con)
        // 6. agi 값에 따라 공격 회피(물공, 마공)
        // 7. men + mDef 값에 따라 마뎀 감소
        // 8. con + pDef 값에 따라 물뎀 감소
        // 9. 레이드 보스 클리어 판정
        rpg.huntStart();
        //rpg.bossRaid();
    }
}
