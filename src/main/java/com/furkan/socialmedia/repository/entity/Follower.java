package com.furkan.socialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * bir kişiyi takip edenlerin listesi
 */
@Table
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long userid;
    private long followerid;

    private int status;
}
