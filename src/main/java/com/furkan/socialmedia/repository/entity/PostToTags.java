package com.furkan.socialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tbluser")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostToTags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long postid;
    private long tagsid;
}
