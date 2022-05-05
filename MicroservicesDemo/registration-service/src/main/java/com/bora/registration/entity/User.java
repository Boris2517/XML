package com.bora.registration.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String username; //unique username
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String role;
    private Boolean enabled;
    private Boolean publicProfile;


}
