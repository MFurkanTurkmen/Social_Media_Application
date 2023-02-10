package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.FollowRepository;
import com.furkan.socialmedia.repository.entity.Follow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FollowService {
   private final FollowRepository fallowRepository;
    public void save(Follow fallow){
        fallowRepository.save(fallow);
    }
    public void update(Follow fallow){
        fallowRepository.save(fallow);
    }
    public void delete(long id){
        fallowRepository.deleteById(id);
    }
    public List<Follow> listAll(){
        return fallowRepository.findAll();
    }

    public Optional<Follow> findById(long id){
        return fallowRepository.findById(id);
    }

}
