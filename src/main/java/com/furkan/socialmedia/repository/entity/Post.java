package com.furkan.socialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private long userid;
    private long sharedtime;
    private String comment;
    private String url;
    private int likecount;
    private int commentcount;
}
