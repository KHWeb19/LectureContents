public class GameManager extends Player {
    private int playerId;

    public GameManager (final int playerId, final int diceCnt) {
        super(diceCnt);

        System.out.printf("GameManager(): playerId - %d, diceCnt - %d\n", playerId, diceCnt);

        this.playerId = playerId;
    }

    @Override
    public String toString() {
        return "GameManager{" + '\n' +
                "player=" + super.toString() + '\n' +
                "playerId=" + playerId +
                '}' + '\n';
    }
}
