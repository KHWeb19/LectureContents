package com.example.demo.controller.jpa.order62.request;

import lombok.Data;

@Data
public class BoardRequest {
    private String title;
    private String writer;
    private String content;

    public BoardRequest(String title, String writer, String content) {
        this.title = title;
        this.writer = writer;
        this.content = content;
    }
}
