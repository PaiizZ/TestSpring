package com.example.test.repository.mapper;

import com.example.test.model.Post;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostMapper implements RowMapper<Post> {

    @Override
    public Post mapRow(ResultSet resultSet, int i) throws SQLException {
        Post post = new Post();
        post.setTopic(resultSet.getString("topic"));
        post.setContent(resultSet.getString("content"));
        post.setDescription(resultSet.getString("description"));
        return post;
    }
}
