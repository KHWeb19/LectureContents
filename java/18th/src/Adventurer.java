public class Adventurer {
    // public: 만 천하에 알리는 공개된 정보
    // private: 자신만의 사적인 정보
    // proteced: 가문의 가보
    protected int str;
    protected int con;

    final int START_VALUE = 10;

    public Adventurer () {
        str = START_VALUE;
        con = START_VALUE;
    }
}
