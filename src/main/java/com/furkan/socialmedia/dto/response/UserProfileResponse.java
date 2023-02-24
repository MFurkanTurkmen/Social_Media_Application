package com.furkan.socialmedia.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileResponse {
    private String username;
    private String name;
    private String surname;
    private String birthdate;
    private String email;
    private String phone;
    private String gender;
    private String avatar;
}
