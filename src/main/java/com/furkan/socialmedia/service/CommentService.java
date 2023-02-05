package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.CommentRepository;
import com.furkan.socialmedia.repository.entity.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//lomboktan gelen cons oluştur ve commentRepository de bu cons'un içinde oluşturmak için yazdık
// direkt constructor oluşturup ta onun içinde this.commentRepository=new Comment diyebilirdik
@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public void save(Comment comment){
        commentRepository.save(comment);
    }

    public void update(Comment comment){
        commentRepository.save(comment);
    }
    public void delete(long id){
        commentRepository.deleteById(id);
    }
    public List<Comment> listAll(){
        return commentRepository.findAll();
    }

    public Optional<Comment> findById(long id){
        return commentRepository.findById(id);
    }

}
