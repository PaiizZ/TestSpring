package com.example.test.controller;

import com.example.test.model.Post;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @RequestMapping(value = "/v1/posts/{postId}", method = RequestMethod.GET)
    public Post getPost(
            @PathVariable("postId") String postId
    ) {
        Post post = new Post().setTopic(postId).setContent("Peak Peak").setDescription("Easy");
        return post;
    }
}
