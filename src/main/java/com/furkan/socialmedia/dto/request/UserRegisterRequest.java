package com.furkan.socialmedia.dto.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterRequest {
    private String username;
    private String name;
    private String surname;
    private String password;
    private String birthday;
    private String gender;
    private String email;
    private String phone;

}
