package com.example.testdemo;

import com.example.testdemo.utility.entity.ScoreCollection;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

@SpringBootTest
class TestdemoApplicationTests {

    @Test
    public void answersArithmeticMeanOfTwoNumbers () {
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        int actualResult = collection.arithmeticMean();

        assertThat(actualResult, equalTo(6));
    }

    @Test
    void contextLoads() {
    }

}
