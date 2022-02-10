package com.example.testdemo.test;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class ClassRoom {
    private static int cnt = 0;
    private int id;
    private String name;
    private int studentId;

    public ClassRoom (String name) {
        id = cnt++;
        this.name = name;
    }
}
