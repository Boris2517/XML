package com.bora.post.service.controller;

import com.bora.post.service.entity.Comment;
import com.bora.post.service.entity.Post;
import com.bora.post.service.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/")
    public ResponseEntity<Post> addNewPost(@RequestBody Post post){
        Post newPost =  postService.addNewPost(post);
        return new ResponseEntity<>(post, HttpStatus.ACCEPTED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Post>> getAllPostsByAuthorUsername(@RequestParam String username){

        return null;
    }

    @PutMapping("/{postId}")
    public ResponseEntity<Post> addComment(@RequestParam String postId, @RequestBody Comment comment){

        return null;
    }

    @PutMapping("/{postId}/like")
    public ResponseEntity<Post> likePost(@RequestParam String postId, @RequestBody Comment comment){

        return null;
    }

    @PutMapping("/{postId}/dislike")
    public ResponseEntity<Post> dislikePost(@RequestParam String postId, @RequestBody Comment comment){

        return null;
    }

}
