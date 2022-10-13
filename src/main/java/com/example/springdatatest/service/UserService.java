package com.example.springdatatest.service;

import com.example.springdatatest.models.Users;
import com.example.springdatatest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<Users> getUserByIdService(Long id) {
        return userRepository.getUsersById(id);
    }

    public Map<Long,Users> getAllMappedUsers() {
        List<Users> allUsers = userRepository.findAll();
        Map<Long, Users> map = allUsers.stream().collect(Collectors.toMap(Users::getId, user -> user));
        System.out.println(map);
        return map;
    }
}
