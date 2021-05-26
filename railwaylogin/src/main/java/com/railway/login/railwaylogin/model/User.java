package com.railway.login.railwaylogin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "users")
public class User {

    @Id
    private int user_id;
    private String user_name;
    private String email_id;
    private String password;
    private String role;
    
}