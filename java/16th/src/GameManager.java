public class GameManager extends Player implements Comparable {
    private int playerId;

    public GameManager (final int playerId, final int diceCnt) {
        super(diceCnt);

        System.out.printf("GameManager(): playerId - %d, diceCnt - %d\n", playerId, diceCnt);

        this.playerId = playerId;
    }

    @Override
    public int compareTo(Object otherObject) {
        GameManager other = (GameManager) otherObject;

        if (this.getSum() < other.getSum()) {
            // getPlayerId() 같은것을 만들면
            // 사용자가 여러명이여도 아래의 루틴을 처리할 수 있게 된다.
            // playerId <<<--- 이 사용자가 누구인지 판별할 수 있도록 id값 부여함
            System.out.println("id(0) 보다 id(1)이 크다.");
            return -1;
        } else if (this.getSum() > other.getSum()) {
            System.out.println("id(0) 보다 id(1)이 작다.");
            return 1;
        } else {
            System.out.println("id(0) 과 id(1)이 같다.");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "GameManager{" + '\n' +
                "player=" + super.toString() + '\n' +
                "playerId=" + playerId +
                '}' + '\n';
    }
}
