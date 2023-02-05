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
public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int count;
}
