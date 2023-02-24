package com.furkan.socialmedia.Controller.Web;

import com.furkan.socialmedia.Utility.StaticValues;
import com.furkan.socialmedia.dto.request.UserRegisterRequest;
import com.furkan.socialmedia.model.ModelLogin;
import com.furkan.socialmedia.model.ModelRegister;
import com.furkan.socialmedia.repository.entity.User;
import com.furkan.socialmedia.service.UserService;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("")

public class Login_RegisterController {

    private final UserService userService;

    /**
     *  ÖNEMLİ !!!!!!
     *  Eğer bir sayfa içinde bir değeri kontrol ediyorsanız, o değerin
     *  muhakkak controller tarafından geliyor olması gerekli. yoksa null
     *  olarak gelen değer sayfanının yğklenmemesine sebebiyet veriri.
     *  Görünen Hata Şekli:
     *  Caused by: org.springframework.expression.spel.SpelEvaluationException: EL1001E: Type conversion problem, cannot convert from null to boolean
     *  İlgili sayfalara, gönderilecek değerlerinm parça parça gönderilmesi
     *  yerine o sayfaya ait bir pageModel oluştuırmak doğru yaklaşımdır.
     *  loginPageModel
     */

    /**
     * getmapping te her hangi bir eklenti yazmıyorum
     * çünkü login e gelen kişinin ilk karşısına
     * çıkmasını istediğim sayfa bu olduğu için.
     *
     * @return
     */
    @GetMapping("/")
    public ModelAndView login() {
        /**
         * Burada model ve view a ihtiyacımız olacak
         * bu nedenle sırası ile bunları ekleyeceğiz
         * bu iki parametreyi kontrol ederek birleştirmesi
         * için de ModelAndView nesnesini kullnacağız.
         */
        ModelAndView view = new ModelAndView();
        view.setViewName("login"); // bu viewsetname thymeleaf dan dolayı
        // -> resources templeates altında login diye bir html var mı diye bakar
        /**
         * html sayfasına gönderilmek üzere adı: model olan bir nesne gönderdi
         * burada gönderdiğim nesne yönetilebilir olması ve kodlama kolaylığı
         * açısından bir sınıf olarak kullanılmıştır.
         */
        view.addObject("model", //burada da attributeName ne ise
                // <h1 th:text="${model.title}"></h1> burada ki model kısmıdır
                // title ise bu nesneye verdiğimiz aşağıdaki adlardır
                ModelLogin.builder()
                        .title("Login Page")
                        .username("Username")
                        .password("Password")
                        .loginbutton("Login")
                        .tabRegister("Sıgn Up")
                        .rememberMe("Remember me")

                        .error(false)
                        .build());

        return view;
    }

    @PostMapping("")
    public Object login(String username, String password) {
        Optional<User> user = userService.findByUsernameAndPassword(username, password);
        if (user.isPresent()) {
            StaticValues.user = user.get();
            return "redirect:/home";
        } else {
            ModelAndView model = new ModelAndView();
            model.addObject("model", //burada da attributeName ne ise
                    // <h1 th:text="${model.title}"></h1> burada ki model kısmıdır
                    // title ise bu nesneye verdiğimiz aşağıdaki adlardır
                    ModelLogin.builder()
                            .title("Login Page")
                            .username("Username")
                            .password("Password")
                            .loginbutton("Login")
                            .tabRegister("Sıgn Up")
                            .rememberMe("Remember me")
                            .error(true)
                            .build());
            model.setViewName("login");
            return model;
        }
    }

    @GetMapping("/register")
    public ModelAndView register() {
        ModelAndView view = new ModelAndView();
        view.setViewName("register");
        view.addObject("modelRegister", ModelRegister.builder()
                .title("Sign Up")
                .name("Name")
                .username("USERNAME")
                .surname("surname")
                .birtdate("BirthDate")
                .email("E-Mail")
                .gender("Gender")
                .password("Password")
                .loginButton("Login Page")
                .submitButton("Sign up")
                .phone("Phone")
                        .createdate(System.currentTimeMillis())
                .build()
        );
        return view;
    }

    @PostMapping("/register")
    public Object register(String username, String name, String surname, String password, String birthday,
                           String gender, String email, String phone) {
        userService.save(UserRegisterRequest.builder()
                        .username(username)
                        .name(name)
                        .surname(surname)
                        .password(password)
                        .birthday(birthday)
                        .gender(gender)
                        .email(email)
                        .phone(phone)
                .build());


        return "redirect:/";
    }


}
