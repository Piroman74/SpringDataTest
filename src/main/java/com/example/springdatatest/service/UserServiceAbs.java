package com.example.springdatatest.service;

import com.example.springdatatest.models.Users;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public interface UserServiceAbs {
    public Optional<Users> getUserByIdService(Long id);

    public Map<Long,Users> getAllMappedUsers();
}
