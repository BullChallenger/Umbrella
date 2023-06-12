package com.umbrella.dto.post;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.umbrella.domain.Post.Post;
import lombok.Getter;

import java.util.List;

@Getter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PostResponseDto {

    private Long postId;
    private String title;
    private String writer;
    private String content;
    private Long likeCount;


    public PostResponseDto(Post post){
        this.postId = post.getId();
        this.title = post.getTitle();
        this.writer = post.getUser().getName();
        this.content = post.getContent();
        this.likeCount = Long.valueOf(post.getLikeCount());
    }


}
