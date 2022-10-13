package com.example.springdatatest.integration.service;

import com.example.springdatatest.models.Company;
import com.example.springdatatest.models.Users;
import com.example.springdatatest.service.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.test.context.ConfigDataApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = ApplicationRunner.class, initializers = ConfigDataApplicationContextInitializer.class)
public class UserServiceIT {
    private static final Long USER_ID = 1L;
    private final UserService userService;

    @Autowired
    public UserServiceIT(UserService userService) {
        this.userService = userService;
    }

    @Test
    void getUserByIdServiceIT() {
        Users user = new Users(USER_ID, "Sam", LocalDate.of(2022, 10, 13), new Company(1L, "Yandex"));
        Optional<Users> userFromData = userService.getUserByIdService(USER_ID);
        assertThat(userFromData.isPresent());
        userFromData.ifPresent(u -> assertThat(u.equals(user)));
    }

    @Test
    void getUserByIdServiceWithMockitoIT() {
        Optional<Users> actualResult = userService.getUserByIdService(USER_ID);
        Assertions.assertThat(actualResult.isPresent());

        Users expectedResult = new Users(USER_ID, "Sam", LocalDate.of(2022, 10, 12), new Company(1L, "Yandex"));
        actualResult.ifPresent(actual -> assertThat(expectedResult.equals(actual)));
    }
}
