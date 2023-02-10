package com.furkan.socialmedia.repository;

import com.furkan.socialmedia.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOptionalByUsernameAndPassword(String username,String password);

}
