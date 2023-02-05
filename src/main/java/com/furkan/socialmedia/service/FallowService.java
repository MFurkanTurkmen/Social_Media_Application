package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.FallowRepository;
import com.furkan.socialmedia.repository.entity.Fallow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FallowService {
   private final FallowRepository fallowRepository;
    public void save(Fallow fallow){
        fallowRepository.save(fallow);
    }
    public void update(Fallow fallow){
        fallowRepository.save(fallow);
    }
    public void delete(long id){
        fallowRepository.deleteById(id);
    }
    public List<Fallow> listAll(){
        return fallowRepository.findAll();
    }

    public Optional<Fallow> findById(long id){
        return fallowRepository.findById(id);
    }

}
