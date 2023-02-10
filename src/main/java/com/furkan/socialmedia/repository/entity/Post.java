package com.furkan.socialmedia.repository.entity;

import lombok.*;

import javax.persistence.*;

@Table
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = true)
    private long userid;
    private String userphoto;
    private String username;
    private long sharedtime;
    @Column(length = 5000 )
    private String comment;
    private String url;
    private int likecount;
    private int dislikecount;
    private int commentcount;
}
