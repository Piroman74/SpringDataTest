package com.example.springdatatest.controller;

import com.example.springdatatest.models.Users;
import com.example.springdatatest.models.dto.UsersDTO;
import com.example.springdatatest.service.UserService;
import com.example.springdatatest.service.UserServiceAbs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {
    private final UserServiceAbs userService;

    @Autowired
    public UserController(UserServiceAbs userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserByIdService(id));
    }

    @GetMapping("/getmap")
    public ResponseEntity<?> getUserMap() {
        return ResponseEntity.ok(userService.getAllMappedUsers());
    }

//    @PostMapping("/addUser")
//    public ResponseEntity<?> addUser(@RequestBody UsersDTO usersDTO){
//
//    }
}
