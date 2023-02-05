package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.PostToTagsRepository;
import com.furkan.socialmedia.repository.entity.PostToTags;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostToTagsService {
    PostToTagsRepository postToTagsRepository;
    public void save(PostToTags postToTags){
        postToTagsRepository.save(postToTags);
    }
    public void update(PostToTags postToTags){
        postToTagsRepository.save(postToTags);
    }
    public void delete(long id){
        postToTagsRepository.deleteById(id);
    }
    public List<PostToTags> listAll(){
        return postToTagsRepository.findAll();
    }

    public Optional<PostToTags> findById(long id){
        return postToTagsRepository.findById(id);
    }
}
