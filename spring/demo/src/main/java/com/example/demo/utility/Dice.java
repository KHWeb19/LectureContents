package com.example.demo.utility;

import lombok.Data;

// @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
// @Getter: 자동 게터 만들어줌
// @Setter: 자동 세터 만들어줌
// @특정 입력이 들어오는 생성자 처리
// @toString 안만들어도 알아서 자동화
// @EqualsAndHashCode: 현재로서 신경 안써도 됨
@Data
public class Dice {
    private int diceNum;
    private final int MAX = 6;
    private final int MIN = 1;
    private final int range = MAX - MIN + 1;

    public void rollDice () {
        diceNum = (int) (Math.random() * range + MIN);
    }
}
