package com.furkan.socialmedia.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * bu sınıf thymeleaf ı kullanırken bizim başlık yerine ne yazıcaksak
 * login butonunun üstüne yazıcaksak onları alıcak
 * yani burası html sayfası için nesne üretme yeridir
 * login controller sınıfında buradan bir nesne üretiriz
 * ve bu nesnelere orada bir değer atayarak thymeleaf e göndeririz
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ModelLogin {
    String title;
    String username;
    String password;
    String loginbutton;

    String tabRegister;
    String rememberMe;
}
