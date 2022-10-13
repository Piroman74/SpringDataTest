package com.example.springdatatest.repository;

import com.example.springdatatest.models.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    public Optional<Users> getUsersById(Long id);

//    List<Users> findAll();
}
