package com.furkan.socialmedia.model;

import com.furkan.socialmedia.repository.entity.Comment;
import com.furkan.socialmedia.repository.entity.Post;
import com.furkan.socialmedia.repository.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ModelHome {
    private String username;

    private String userId;
    private long followerCount;
    private String email;
    private List<Post> postlist;
    private List<Comment> commentList;
    private long followCount;
    private List<User> userList;

}
