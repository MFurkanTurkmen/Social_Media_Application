package com.furkan.socialmedia.repository.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tbluser")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String username;
    private String name;
    private String surname;
    private String password;
    private String birthdate;
    private String email;
    private String phone;
    private String gender;
    private String avatar;
    private Date createDate;


}
