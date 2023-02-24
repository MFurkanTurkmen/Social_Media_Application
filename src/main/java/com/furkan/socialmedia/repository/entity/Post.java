package com.furkan.socialmedia.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Table
@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Post extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = true)
    private long userid;
    @Column(length = 5000 )
    private String comment;
    private String username;
    private String userphoto;
    private String url;
    private int likecount;
    private int dislikecount;
}
