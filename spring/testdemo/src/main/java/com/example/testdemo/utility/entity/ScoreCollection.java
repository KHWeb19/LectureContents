package com.example.testdemo.utility.entity;

import com.example.testdemo.utility.service.Scoreable;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
    private List<Scoreable> scores = new ArrayList<>();

    public void add(Scoreable scoreable) {
        scores.add(scoreable);
    }

    public int arithmeticMean () {
        int total = scores.stream().mapToInt(Scoreable::getScore).sum();

        return total / scores.size();
    }
}
