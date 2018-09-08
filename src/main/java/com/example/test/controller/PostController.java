package com.example.test.controller;

import com.example.test.model.Post;
import com.example.test.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

//    @RequestMapping(value = "/v1/posts/{postId}", method = RequestMethod.GET)
    @GetMapping("/v1/posts/{postId}")
    public ResponseEntity<Post> getPost(
            @PathVariable("postId") String postId
    ) {
        return new ResponseEntity<>(postService.getPost(postId), HttpStatus.OK);
    }

    @PostMapping("/v1/posts")
    public ResponseEntity<Integer> createPost(
            @RequestBody Post post
    ) {
        return new ResponseEntity<>(postService.createPost(post), HttpStatus.OK);
    }
}
