package com.furkan.socialmedia.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FindPostResponse {

    private String userphoto;
    private String username;
    @Column(length = 5000 )
    private String comment;
    private String url;
    private int likecount;
}
