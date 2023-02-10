package com.furkan.socialmedia.repository;

import com.furkan.socialmedia.repository.entity.Comment;
import com.furkan.socialmedia.repository.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository

public interface PostRepository  extends JpaRepository<Post,Long> {
    Optional<List<Post>> findByUserid(long userid);
}
