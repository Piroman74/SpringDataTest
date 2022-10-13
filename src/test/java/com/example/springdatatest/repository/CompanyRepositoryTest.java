//package com.example.springdatatest.repository;
//
//import com.example.springdatatest.SpringDataTestApplication;
//import com.example.springdatatest.models.Company;
//import lombok.RequiredArgsConstructor;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//@Transactional
//@SpringBootTest(classes = SpringDataTestApplication.class)
//class CompanyRepositoryTest {
//    @Autowired
//    private CompanyRepository companyRepository;
//
//    @Test
//    void findById() {
//        Optional<Company> company = companyRepository.findById(1L);
//        System.out.println(company.get());
//        assertTrue(company.isPresent());
//    }
//
//    @Test
//    void findByNameTest(){
//        Company company = companyRepository.findByName("Goog").get();
//        System.out.println(company);
//    }
//
//    @Test
//    void delete() {
////        Optional<Company> company = companyRepository.findById(1L);
//
//        Company c1 = Company.builder()
//                .id(1L)
//                .name("Goog")
//                .build();
//         companyRepository.delete(c1);
//    }
//}