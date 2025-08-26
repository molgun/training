package com.example.demo.vo;

import java.util.List;
import java.util.UUID;

public class BlogPost {
    private List<Comment> comments;
    private Integer versionNumber;

    public void likeComment(Integer commentId) {
        comments.get(0).like();
    }
}
