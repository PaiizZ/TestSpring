package com.example.test.repository;

import com.example.test.config.CommonConstant;
import com.example.test.exception.NotFoundException;
import com.example.test.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {
    private List<Post> postList;

    public PostRepository(){
        postList = new ArrayList<>();
        postList.add(new Post().setTopic("1"));
        postList.add(new Post().setTopic("2"));
        postList.add(new Post().setTopic("3"));
    }

    public Post getPost(String id){
        for (Post p: postList) {
            if (id.equals(p.getTopic())){
                return p;
            }
        }
        throw new NotFoundException(CommonConstant.ERROR404, "Can't find post");
    }
}
