package com.furkan.socialmedia.repository;

import com.furkan.socialmedia.repository.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FollowRepository extends JpaRepository<Follow,Long> {
}
