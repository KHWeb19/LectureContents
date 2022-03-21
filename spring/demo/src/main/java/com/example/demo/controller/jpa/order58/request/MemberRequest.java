package com.example.demo.controller.jpa.order58.request;

import lombok.Data;

@Data
public class MemberRequest {
    private String id;
    private String pw;
    private String auth;

    public MemberRequest (String userId, String password, String auth) {
        this.id = userId;
        this.pw = password;
        this.auth = auth;
    }
}
