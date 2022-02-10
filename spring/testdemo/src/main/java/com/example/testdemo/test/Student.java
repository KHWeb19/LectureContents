package com.example.testdemo.test;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class Student {
    private static int cnt = 0;
    private int id;
    private String name;
    private String major;

    private List<ClassRoom> classRoomList = new ArrayList<>();

    public Student (String name, String major) {
        id = cnt++;
        this.name = name;
        this.major = major;
    }

    public boolean registerClass (ClassRoom classRoom) {
        classRoomList.add(classRoom);
        classRoom.setStudentId(id);
        return true;
    }
}
