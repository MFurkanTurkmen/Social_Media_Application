package com.furkan.socialmedia.Controller.Web;

import com.furkan.socialmedia.Utility.StaticValues;
import com.furkan.socialmedia.repository.entity.Post;
import com.furkan.socialmedia.repository.entity.User;
import com.furkan.socialmedia.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

@RequiredArgsConstructor
@Controller
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    @PostMapping("/save")
    public Object save(Long userid, String content, MultipartFile image) {
        User user = StaticValues.user;
        String resim_id = UUID.randomUUID().toString();

        try {

            String resimdosyayolu = "/Users/furkanturkmen/Desktop/socialmediafoto/" + resim_id + ".png";
            File file = new File(resimdosyayolu);
            image.transferTo(file);

            Post post = Post.builder()
                    .comment(content)
                    .userid(user.getId())
                    .likecount(0)
                    .dislikecount(0)
                    .url(resimdosyayolu)
                    .username(user.getUsername())
                    .userphoto(user.getAvatar())
                    .build();
            postService.save(post);
            return "redirect:/home";

        } catch (IOException ex) {

            ModelAndView modelAndView= new ModelAndView("home");
            System.out.println("yeni postta hata"+ex.getMessage());
            return "redirect:/home";


        }

    }



}
