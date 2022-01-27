package com.example.demo.utility.series;

import lombok.Getter;

@Getter
public class MySequence {
    private int ratio;
    private int type;
    private int result;

    public MySequence(int ratio, int type) {
        this.ratio = ratio;
        this.type = type;
    }

    public void calcSequenceOrder (int order) {
        result = (int) (Math.pow(ratio, order - 1));
    }
}
