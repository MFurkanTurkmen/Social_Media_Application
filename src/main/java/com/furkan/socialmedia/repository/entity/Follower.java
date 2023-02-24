package com.furkan.socialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

/**
 * bir kişiyi takip edenlerin listesi
 */
@Table
@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Follower extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long userid;
    private long followerid;

    private int status;
}
