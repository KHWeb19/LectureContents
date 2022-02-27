package com.example.demo.entity.order45;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private int studentNo;
    private String name;
    private int classnum;
    private int mean;
    private int korean;
    private int english;
    private int math;
    private int science;
    private Date regDate;
}
