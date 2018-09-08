package com.example.test.controller;

import com.example.test.model.Post;
import com.example.test.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping(value = "/v1/posts/{postId}", method = RequestMethod.GET)
    public ResponseEntity<Post> getPost(
            @PathVariable("postId") String postId
    ) {
        return new ResponseEntity<>(postService.getPost(postId), HttpStatus.OK);
    }
}
