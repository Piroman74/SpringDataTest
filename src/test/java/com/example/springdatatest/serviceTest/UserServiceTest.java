package com.example.springdatatest.serviceTest;

import com.example.springdatatest.models.Company;
import com.example.springdatatest.models.Users;
import com.example.springdatatest.repository.UserRepository;
import com.example.springdatatest.service.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
//@ExtendWith(MockitoExtension.class)
////@MockitoSettings(strictness = Strictness.LENIENT)
public class UserServiceTest {
    private static final Long USER_ID = 1L;
    @Spy
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;


    @Test
    void getUserByIdServiceTestWithMockito() {
        Mockito
                .doReturn(Optional.of(new Users(USER_ID, "Sam", LocalDate.of(2022, 10, 12), new Company(1L, "Yandex"))))
                .when(userRepository)
                .getUsersById(USER_ID); // стаббер userRepository

        Optional<Users> actualResult = userService.getUserByIdService(USER_ID);
        Assertions.assertThat(actualResult.isPresent());

        Users expectedResult = new Users(USER_ID, "Sam", LocalDate.of(2022, 10, 12), new Company(1L, "Yandex"));
        actualResult.ifPresent(actual -> assertThat(expectedResult.equals(actual)));
    }


    @Test
    void test_Get_All_Users_Map() {

    }
}