package com.furkan.socialmedia.model;

import com.furkan.socialmedia.repository.entity.Post;
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
    private Optional<List<Post>> postlist;
    private long followCount;

}
