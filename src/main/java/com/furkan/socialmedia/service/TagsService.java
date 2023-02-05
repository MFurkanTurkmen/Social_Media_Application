package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.TagsRepository;
import com.furkan.socialmedia.repository.entity.Tags;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TagsService {
    TagsRepository tagsRepository;
    public void save(Tags tags){
        tagsRepository.save(tags);
    }
    public void update(Tags tags){
        tagsRepository.save(tags);
    }
    public void delete(long id){
        tagsRepository.deleteById(id);
    }
    public List<Tags> listAll(){
        return tagsRepository.findAll();
    }

    public Optional<Tags> findById(long id){
        return tagsRepository.findById(id);
    }
}
