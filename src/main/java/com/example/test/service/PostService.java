package com.example.test.service;

import com.example.test.model.Post;
import com.example.test.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public Post getPost(String id) {
        return repository.getPost(id);
    }
    public int createPost(Post post) { return repository.createPost(post); }
    public int deletePost(String id) { return repository.deletePost(id); }
    public int updatePost(String id, Post post) { return repository.updatePost(id, post); }
}
