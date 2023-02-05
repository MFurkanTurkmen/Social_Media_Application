package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.FallowerRepository;
import com.furkan.socialmedia.repository.entity.Fallower;
import com.furkan.socialmedia.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class FallowerService {
    private final FallowerRepository fallowerRepository;
    public void save(Fallower fallower){
        fallowerRepository.save(fallower);
    }
    public void update(Fallower fallower){
        fallowerRepository.save(fallower);
    }
    public void delete(long id){
        fallowerRepository.deleteById(id);
    }
    public List<Fallower> listAll(){
        return fallowerRepository.findAll();
    }

    public Optional<Fallower> findById(long id){
        return fallowerRepository.findById(id);
    }
}
