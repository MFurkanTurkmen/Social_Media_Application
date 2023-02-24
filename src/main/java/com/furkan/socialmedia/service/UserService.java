package com.furkan.socialmedia.service;

import com.furkan.socialmedia.dto.request.UserRegisterRequest;
import com.furkan.socialmedia.dto.request.UserUpdateRequest;
import com.furkan.socialmedia.mapper.IUserMapper;
import com.furkan.socialmedia.repository.UserRepository;
import com.furkan.socialmedia.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class UserService  {
    private final UserRepository userRepository;

    public void save(UserRegisterRequest dto){

        User user= IUserMapper.INSTANCE.toUser(dto);
        if (user== null )return;
        userRepository.save(user);
    }
    public void update(UserUpdateRequest dto){
        User user= IUserMapper.INSTANCE.toUser(dto);
        if (user==null)return;
        userRepository.save(user);

    }
    public void delete(long id){
        User user= findById(id).get();
        if (user==null) return;
        userRepository.deleteById(id);

    }
    public List<User> findAll(){
        return userRepository.findAll();

    }

    public Optional<User> findById(long id){

        return userRepository.findById(id);

    }


    public Optional<User> findByUsernameAndPassword(String username,String password){
        return userRepository.findOptionalByUsernameAndPassword(username,password);
    }

    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

}
