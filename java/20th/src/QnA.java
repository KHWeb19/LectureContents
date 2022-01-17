public class QnA extends Player{

    //gmArr 배열이 각각 플레이어라 생각하자
    //근데 차례데로는 어떻게 하지 ㅡ ㅅ ㅡ ;
    //턴제를 구현 못하겠음
    private int GOAL = 50;

    private int[] gmArr;
    private boolean gameSet = true;

    private int playerNum;

    public QnA(final int diceNum ,final int playerNum){
        super(diceNum);
        this.playerNum = playerNum;

        gmArr = new int[playerNum];

    }


    public void checkSum(){
        gmArr[checkPlayer] += sum;
        System.out.println("합계" + gmArr[checkPlayer]);
    }


    public void skillEffect() {
        switch (specialNum) {
            case 1:
                for (int j = 0; j < playerNum; j++) {
                    if (j == checkPlayer) {
                        continue;
                    } else {

                        gmArr[j] -= 1;
                        continue;
                    }

                }
                System.out.println("상대방들은 뒤로 한칸 물러가시오");
                break;
            case 3:
                for (int j = 0; j < playerNum; j++) {
                    gmArr[j] -= 6;
                }
                System.out.println("모두 뒤로 6칸 물러나시오");
                break;
            case 4:
                System.out.println("처음으로 돌아가시오");
                gmArr[checkPlayer] = 0;
                break;

            case 6:
                System.out.println("모두" + (checkPlayer + 1) + "에게 3씩 주시오");
                for (int j = 0; j < playerNum; j++) {
                    if (j == checkPlayer) {
                        continue;
                    } else {
                        gmArr[checkPlayer] += 3;
                        gmArr[j] -= 3;
                        continue;
                    }

                }


                break;

                // case 2, 5: 는 불가능!
            case 2:
            case 5:
                System.out.printf("앞으로 %d만큼 가시오\n", specialNum);
                gmArr[checkPlayer] += specialNum;
                break;

        }
        //이 부분을 여기 넣는게 좋을까
        //checkWinner에 넣어놓으니 기능이 저기 가 있으면 안될거 같음
        //강사님꺼 보니 여기에 넣었음
        for (int i = 0; i < playerNum; i++) {
            if (gmArr[i] < 0) {
                gmArr[i] = 0;
            }
        }
    }

    public void checkWinner(){
        if(gmArr[checkPlayer] < GOAL){
            checkPlayer++;
            specialNum = 0;

            if(checkPlayer == playerNum) {
                checkPlayer = 0;
            }

            checkWin = true;

        }else if(gmArr[checkPlayer] >= GOAL){
            System.out.println(checkPlayer+1 + "번 player 승리!!");
            gameSet = false;
        }
    }

    public void gameStart() throws InterruptedException {
        do {
            checkTurn();
            myTurnRollDice();
            checkSum();
            checkSpecial();
            skillEffect();
            checkWinner();
        }while(gameSet);
    }
}