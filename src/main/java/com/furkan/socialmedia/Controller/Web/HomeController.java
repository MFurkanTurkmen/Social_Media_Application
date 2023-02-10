package com.furkan.socialmedia.Controller.Web;

import com.furkan.socialmedia.Utility.StaticValues;
import com.furkan.socialmedia.model.ModelHome;
import com.furkan.socialmedia.repository.FollowerRepository;
import com.furkan.socialmedia.repository.PostRepository;
import com.furkan.socialmedia.repository.entity.Follower;
import com.furkan.socialmedia.repository.entity.Post;
import com.furkan.socialmedia.repository.entity.User;
import com.furkan.socialmedia.service.FollowerService;
import com.furkan.socialmedia.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeController {
    private final FollowerService followerService;
    private final PostService postService;

    @GetMapping("")
    public Object homeView() {
        User user = StaticValues.user;
        if (user==null){
            return "redirect:/";
        }
        Optional<List<Post>> postList=postService.findByUserid(user.getId());
        long followercount= followerService.findByUserid(user.getId()).stream().count();
        ModelAndView view = new ModelAndView();
        view.setViewName("home");
        view.addObject("modelHome", ModelHome.builder()
                .username(user.getUsername())
                        .followerCount(followercount)
                .build());

        return view;
    }



}
