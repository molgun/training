package com.example.demo.vo;

public class Comment {
    private Integer id;
    private String content;
    private Integer likeCount; 

    public void like() {
        likeCount++;
    }

    public Integer getId() {
        return id;
    }

    
}
