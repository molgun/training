package com.example.demo.vo;

import java.util.UUID;

public class BlogPostApplicationService {

    private BlogPostService blogPostService; 

    public void like(UUID blogPostId) 
        checksecurity()
        // BlogPost post = repository.findById(blogPostId)
        post.like();
        blogPostService.runLogic();
        repository.save(post);
        kafka.send
    }
}
