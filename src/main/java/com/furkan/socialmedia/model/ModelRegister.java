package com.furkan.socialmedia.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ModelRegister {
    private String title;
    private String username;
    private String name;
    private String surname;
    private String password;
    private String birtdate;
    private String gender;
    private String email;
    private String phone;
    private String submitButton;
    private String loginButton;
}
