package com.example.springdatatest.models.dto;

import com.example.springdatatest.models.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsersDTO {
    private Long id;
    private String username;
    private LocalDate birthday;
    private Company company;
}
