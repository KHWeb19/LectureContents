package com.example.demo.entity.order40;

import lombok.Data;

import java.util.Date;

@Data
public class Member {

    private int memberNo;
    private String id;
    private String pw;
    private String intro;
    private Date regDate;
}
