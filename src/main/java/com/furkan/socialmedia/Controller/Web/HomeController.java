package com.furkan.socialmedia.Controller.Web;

import com.furkan.socialmedia.Utility.StaticValues;
import com.furkan.socialmedia.model.ModelHome;
import com.furkan.socialmedia.repository.FollowerRepository;
import com.furkan.socialmedia.repository.PostRepository;
import com.furkan.socialmedia.repository.entity.Comment;
import com.furkan.socialmedia.repository.entity.Follower;
import com.furkan.socialmedia.repository.entity.Post;
import com.furkan.socialmedia.repository.entity.User;
import com.furkan.socialmedia.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.html.Option;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeController {
    private final FollowerService followerService;
    private final PostService postService;
    private final UserService userService;
    private final CommentService commentService;
    private final FollowService followService;

    @GetMapping("")
    public Object homeView() {
        User user = StaticValues.user;
        if (user==null){
            return "redirect:/";
        }

        long followerCount= followerService.findByUserid(user.getId()).stream().count();
        Optional<List<Post>> postList= postService.findByUserid(user.getId());
        List<User> userList= userService.findAll();
        new ArrayList<>();
        List<Comment> commentList= new ArrayList<>();
        for (Post post : postList.get()){

            commentList.addAll(commentService.findByPostId(post.getId()));
        }
 // post comment kısmı hatalı

        ModelAndView view = new ModelAndView();
        view.setViewName("home");
        view.addObject("modelHome",ModelHome.builder()
                .username(user.getUsername())
                .followerCount(followerCount)
                .postlist(postList.get())
                .userList(userList)
                .commentList(commentList)
                .build());
        return view;

    }

//    @PostMapping("/other")
//    public Object otherss(String username){
//        System.out.println(username);
//        return "redirect:/other";
//    }




    @PostMapping("/other")
    public Object others(String username) {
        User user = StaticValues.user;
        if (user==null){
            return "redirect:/";
        }
        User userother = userService.findByUsername(username);

        long followerCount= followerService.findByUserid(user.getId()).stream().count();

        Optional<List<Post>> postList= postService.findByUserid(userother.getId());

        List<User> userList= userService.findAll();
        new ArrayList<>();

        // post comment kısmı hatalı
        List<Comment> commentList= new ArrayList<>();
        for (Post post : postList.get()){

            commentList.addAll(commentService.findByPostId(post.getId()));
        }
        // post comment kısmı hatalı

        ModelAndView view = new ModelAndView();
        view.setViewName("other");
        view.addObject("modelHome",ModelHome.builder()
                .username(user.getUsername())
                .followerCount(followerCount)
                .postlist(postList.get())
                .userList(userList)
                .commentList(commentList)
                .build());
        return view;

    }

    @GetMapping("/other")
    public Object other(String username) {
        User user = StaticValues.user;
        if (user==null){
            return "redirect:/";
        }
        User userother = userService.findByUsername(username);

        long followerCount= followerService.findByUserid(user.getId()).stream().count();
        Optional<List<Post>> postList= postService.findByUserid(userother.getId());
        List<User> userList= userService.findAll();
        new ArrayList<>();

        // post comment kısmı hatalı
        List<Comment> commentList= new ArrayList<>();
        for (Post post : postList.get()){

            commentList.addAll(commentService.findByPostId(post.getId()));
        }
        // post comment kısmı hatalı

        ModelAndView view = new ModelAndView();
        view.setViewName("other");
        view.addObject("modelHome",ModelHome.builder()
                .username(user.getUsername())
                .followerCount(followerCount)
                .postlist(postList.get())
                .userList(userList)
                .commentList(commentList)
                .build());
        return view;

    }










//    @GetMapping("/postsave")
//    public void post(){
//        postService.save(Post.builder()
//                        .userid(1)
//                        .comment("2. postun yorumu olacak yer ve 1.post için açıklama yanlış gitti")
//                        .dislikecount(123)
//                        .likecount(131)
//
//                .build());
//    }


        @GetMapping("/postcommentsave")
    public void postcomment(){
        commentService.save(Comment.builder()
                        .userid(3)
                        .postid(2)
                        .comment("2.posta yorum ids i= 3 olan kullanıcı ile yaptım ")

                .build());

    }



}// class
