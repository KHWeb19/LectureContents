package com.example.testdemo;

import com.example.testdemo.test.ClassRoom;
import com.example.testdemo.test.Student;
import com.example.testdemo.test.StudentManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {

    ClassRoom[] classRoom;
    Student[] studentArr;

    @BeforeEach
    public void create () {
        String[][] studentValue = {
                { "minji", "physics" },
                { "chihyun", "biology" },
                { "hyunho", "electronics" }
        };

        String[] classRoomValue = {
                "수학", "영어", "국사"
        };

        classRoom = new ClassRoom[classRoomValue.length];
        studentArr = new Student[studentValue.length];

        for (int i = 0; i < studentValue.length; i++) {
            classRoom[i] = new ClassRoom(classRoomValue[i]);
            studentArr[i] = new Student(studentValue[i][0], studentValue[i][1]);
        }
    }

    @Test
    public void test() {
        for (int i = 0; i < 7; i++) {
            boolean isOk = studentArr[(int) (Math.random() * 3)].registerClass(
                    classRoom[(int) (Math.random() * 3)]
            );

            assertFalse(isOk);
        }
    }
}
