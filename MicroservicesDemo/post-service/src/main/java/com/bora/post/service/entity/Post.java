package com.bora.post.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    private String id;
    private String content;
    private String author;
    private int numberOfLikes;
    private List<String> peopleThatLikePost;
    private int numberOfDislikes;
    private List<String> peopleThatDislikePost;
    private List<Comment> commentList;
}
