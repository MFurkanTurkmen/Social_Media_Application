package com.furkan.socialmedia.repository;

import com.furkan.socialmedia.repository.entity.Follower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FollowerRepository extends JpaRepository<Follower,Long> {

    Optional<Long> findByUserid(Long userid);
}
