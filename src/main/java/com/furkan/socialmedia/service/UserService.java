package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.UserRepository;
import com.furkan.socialmedia.repository.entity.Comment;
import com.furkan.socialmedia.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }
    public void update(User user){

        userRepository.save(user);
    }
    public void delete(long id){
        userRepository.deleteById(id);
    }
    public List<User> listAll(){

        return userRepository.findAll();
    }

    public Optional<User> findById(long id){
        return userRepository.findById(id);
    }


    public Optional<User> findByUsernameAndPassword(String username,String password){
        return userRepository.findOptionalByUsernameAndPassword(username,password);
    }



}
