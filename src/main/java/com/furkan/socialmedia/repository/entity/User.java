package com.furkan.socialmedia.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Table(name = "tbluser")
@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{
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



}
