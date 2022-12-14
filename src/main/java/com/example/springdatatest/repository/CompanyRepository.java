package com.example.springdatatest.repository;

import com.example.springdatatest.models.Company;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Optional<Company> findByName(String name);

    @Fetch(FetchMode.JOIN)
    @Query("select c from Company c where c.id = :id")
    Optional<Company> findById(Long id);

}
