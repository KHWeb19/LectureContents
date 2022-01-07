public class Bank3Ans8ClassTest {
    public static void main(String[] args) {
        // 주사위는 각자 2개씩 굴릴 수 있다.
        // 처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
        // (2, 4, 6, 8, 10, 12)
        
        // 1. Player 클래스가 필요함
        // 2. Dice 클래스가 필요함
        // 3. GameManager 클래스가 필요함
        GameManager gm = new GameManager(2, 2); // 사용자 수, 사용하는 주사위 수

        gm.startGame();
    }
}
