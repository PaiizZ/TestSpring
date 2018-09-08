package com.example.test.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @RequestMapping(value = "/v1/posts/{postId}", method = RequestMethod.GET)
    public String getPost(
            @PathVariable("postId") String postId
    ) {
        return "HelloWorld" + postId;
    }
}
