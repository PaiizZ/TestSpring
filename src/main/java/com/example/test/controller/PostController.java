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

    @DeleteMapping("/v1/deletepost/{postId}")
    public ResponseEntity<Integer> deletePost(
            @PathVariable("postId") String postId
    ) {
        return new ResponseEntity<>(postService.deletePost(postId), HttpStatus.OK);
    }

    @PutMapping("/v1/updatepost/{postId}")
    public ResponseEntity<Integer> updatePost(
            @PathVariable("postId") String postId,
            @RequestBody Post post
    ) {
        return new ResponseEntity<>(postService.updatePost(postId, post), HttpStatus.OK);
    }
}
