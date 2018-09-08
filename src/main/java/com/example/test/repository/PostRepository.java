package com.example.test.repository;

import com.example.test.config.CommonConstant;
import com.example.test.exception.NotFoundException;
import com.example.test.model.Post;
import com.example.test.repository.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class PostRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Post getPost(String id){
//        for (Post p: postList) {
//            if (id.equals(p.getTopic())){
//                return p;
//            }
//        }
//        throw new NotFoundException(CommonConstant.ERROR404, "Can't find post");
        String sql = "SELECT * FROM post WHERE id = ?";
        Post post = jdbcTemplate.queryForObject(sql, new Object[]{id}, new PostMapper());
        return post;
    }

    public int createPost(Post post){
        String sql = "INSERT into post (id, topic, content, description) values(?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{UUID.randomUUID().toString(), post.getTopic(), post.getContent(), post.getDescription()});
    }
}
