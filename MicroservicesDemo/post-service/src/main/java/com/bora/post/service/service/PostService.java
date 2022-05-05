package com.bora.post.service.service;

import com.bora.post.service.entity.Post;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PostService {
    Post addNewPost(Post post);
}
