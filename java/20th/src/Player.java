public class Player {

    //먼저 주사위를 돌리고
    //짝수 판별
    //짝수시 스폐셜 아닐시 상대방이 던진다
    //스폐셜시 스폐셜 던지고 스킬 적용하고
    //상대방 턴턴

    //돌아가면서 주사위를 던지게 하고싶은데
    //플레이어가 필요한가??
    //diceArr 배열이 각 플레이어라고 생각한다면?
    //만약에 플레이어 3명이고 주사위가 2개라면?

    private int[] diceArr;

    int checkPlayer = 0;
    private int diceNum;

    int sum;
    int specialNum;

    boolean checkWin = true;

    Dice dc;

    public Player(final int diceNum){
        dc = new Dice();

        this.diceNum = diceNum;

        diceArr = new int[diceNum];
    }

    public void checkTurn(){

        while(checkWin) {
            System.out.println(checkPlayer + 1 + " 번 플레이어가 주사위를 던질 차례입니다.");
            checkWin = false;
        }
    }

    public void myTurnRollDice() throws InterruptedException {
        sum = 0;

        for(int i = 0; i < diceNum; i++ ){
            diceArr[i] = dc.rollDice();

            sum += diceArr[i];
        }
        System.out.println("주사위의 합은 " + sum);

        Thread.sleep(3000);
    }

    public void checkSpecial(){
        if(sum % 2 == 0){
            System.out.println("스폐셜 주사위를 돌리시오");
            rollSpecialDice();
        }
    }

    public void rollSpecialDice(){
        specialNum =  dc.rollDice();
        System.out.println("스페셜 스킬" + specialNum + "발동!!");
    }
}