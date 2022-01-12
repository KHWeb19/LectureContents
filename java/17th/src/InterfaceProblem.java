public class InterfaceProblem {
    public static void main(String[] args) throws InterruptedException {
        // 앞서 이야기 했듯이 게임을 하나 만들어봅시다.
        // qSkill, wSkill 두 개 정도를 만들고
        // 캐릭터가 많으면 힘드니까 전사, 마법사 정도로 처리하면 되겠습니다.
        // 여기서도 모험가 -> 전사 -> 2차 전직(전사)
        //         모험가 -> 법사 -> 2차 전직(법사)
        // 이와 같은 형식으로 설정도 가능할 것입니다.

        // 1. Adventurer(모험가) 클래스 생성 필요
        // 2. Warrior(전사) 클래스 생성
        // 3. Magician(법사) 클래스 생성
        // 4. Knight(기사) 클래스 생성
        // 5. Wizard(위자드) 클래스 생성
        // 6. 기본 스탯 (phy atk, mag atk, hp, mp, phy def, mag def,
        //              str(완력), con(vit:체력), dex(재주), agi(민첩), iq(지능), men(정신))
        //    6-2) 경험치 바와 레벨 정보 추가
        // 7. 1차 전직에서는 주력 스탯과 부스탯에 + 1000을 주도록 한다.
        //    나머지 스탯은 + 500씩 주도록 한다.
        //    전사(완력, 체력), 법사(지능, 정신)
        // 8. 2차 전직에서는 새로운 기능을 열어주도록 한다.
        //    전사계(분노 게이지), 법사계(부스트 게이지)
        //    분노 게이지: 뚜까 패거나 처맞으면 차오른다.
        //    부스트 게이지: 턴당 1씩 차오른다.
        //    분노 게이지를 활용해서 시전할 수 있는 스킬이 있다.
        //    부스트 게이지는 데미지를 증폭시켜준다. (몇 배 증폭 ???)
        // 9. 턴을 구현했으므로 게임을 시작하면 무한 루프를 돌면서 몬스터가 등장하고
        //    캐릭터들은 몬스터들을 뚜들겨 패야 한다.
        // 10. 경험치 시스템과 레벨업 시스템이 필요하다.
        // 11. 몬스터 정보(이걸 또 다 만들려면 너무 많으니까 그냥 같은 몬스터만 오지게 쏟아지게)

        // 초기 캐릭터 생성이나 이런 부분까지는 생략하도록 한다.
        /* 테스트 코드 동작 완료
        Adventurer adv = new Adventurer();

        // test code (모험가)
        adv.attack();
        adv.qSkill();
        adv.wSkill();

        // test code (전사)
        Warrior war = new Warrior();

        war.attack();
        war.qSkill();
        war.wSkill();

        // test code (법사)
        Magician mag = new Magician();

        mag.attack();
        mag.qSkill();
        mag.wSkill();

        // test code (기사)
        Knight kni = new Knight();

        kni.attack();
        kni.qSkill();
        kni.wSkill();

        // test code (위자드)
        Wizard wiz = new Wizard();

        wiz.attack();
        wiz.qSkill();
        wiz.wSkill(); */

        RolePlayingGame rpg = new RolePlayingGame();

        rpg.gameStart();
    }
}
