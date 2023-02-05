package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.PostRepository;
import com.furkan.socialmedia.repository.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {
    PostRepository postRepository;
    public void save(Post post){
        postRepository.save(post);
    }
    public void update(Post post){
        postRepository.save(post);
    }
    public void delete(long id){
        postRepository.deleteById(id);
    }
    public List<Post> listAll(){
        return postRepository.findAll();
    }

    public Optional<Post> findById(long id){
        return postRepository.findById(id);
    }
}
