package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.FollowerRepository;
import com.furkan.socialmedia.repository.entity.Follower;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class FollowerService {
    private final FollowerRepository followerRepository;
    public void save(Follower fallower){
        followerRepository.save(fallower);
    }
    public void update(Follower fallower){
        followerRepository.save(fallower);
    }
    public void delete(long id){
        followerRepository.deleteById(id);
    }
    public List<Follower> listAll(){
        return followerRepository.findAll();
    }

    public Optional<Long> findByUserid(long userid){
        return followerRepository.findByUserid(userid);

    }

    public Optional<Follower> findById(long id){
        return followerRepository.findById(id);
    }
}