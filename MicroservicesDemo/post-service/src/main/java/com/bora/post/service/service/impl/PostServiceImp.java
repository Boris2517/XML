package com.bora.post.service.service.impl;

import com.bora.post.service.entity.Post;
import com.bora.post.service.repository.PostRepository;
import com.bora.post.service.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImp implements PostService {

    private PostRepository postRepository;

    @Autowired
    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @Override
    public Post addNewPost(Post post) {
        return postRepository.insert(post);
    }
}
