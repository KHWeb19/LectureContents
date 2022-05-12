package com.example.demo.controller.jpa.order63.response;

import lombok.Data;

@Data
public class JpaMemberBothResponse {
    private String userId;

    public JpaMemberBothResponse (String userId) {
        this.userId = userId;
    }
}
