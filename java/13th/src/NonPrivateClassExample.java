public class NonPrivateClassExample {
    public static void main(String[] args) {
        NonPrivateClass npc = new NonPrivateClass();

        npc.age = 10;
        npc.name = "이렇게 맘대로 바꿀 수 있습니다.";

        System.out.println(npc);
    }
}
