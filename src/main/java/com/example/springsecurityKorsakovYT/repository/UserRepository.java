package com.example.springsecurityKorsakovYT.repository;

import com.example.springsecurityKorsakovYT.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<MyUser, Long> {

    Optional<MyUser> findByName(String username);
}
