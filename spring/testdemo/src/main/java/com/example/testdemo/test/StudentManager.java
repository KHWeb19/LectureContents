package com.example.testdemo.test;

public class StudentManager {
    private final String[][] studentValue = {
            { "minji", "physics" },
            { "chihyun", "biology" },
            { "hyunho", "electronics" }
    };

    private final String[] classRoomValue = {
            "수학", "영어", "국사"
    };

    private ClassRoom[] classRoom;
    private Student[] studentArr;

    public StudentManager () {
        classRoom = new ClassRoom[classRoomValue.length];
        studentArr = new Student[studentValue.length];

        for (int i = 0; i < studentValue.length; i++) {
            classRoom[i] = new ClassRoom(classRoomValue[i]);
            studentArr[i] = new Student(studentValue[i][0], studentValue[i][1]);
        }
    }

    public boolean randomRegister () {
        for (int i = 0; i < 7; i++) {
            boolean isOk = studentArr[(int) (Math.random() * 3)].registerClass(
                    classRoom[(int) (Math.random() * 3)]
            );

            if (!isOk) {
                return isOk;
            }
        }

        return true;
    }
}
