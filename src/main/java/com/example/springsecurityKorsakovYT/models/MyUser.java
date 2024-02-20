package com.example.springsecurityKorsakovYT.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@Data
@Entity
@Table(name = "users")
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String password;

    private String roles;
}
