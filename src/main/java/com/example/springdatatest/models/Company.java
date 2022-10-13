package com.example.springdatatest.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.NamedQuery;
import java.util.HashMap;
import java.util.Map;

@NamedQuery(
        name = "Company.findByName",
        query = "select c from Company c where c.name = :name"
)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company implements BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

//    @Builder.Default
//    @ElementCollection
//    @CollectionTable(name = "company_locales", joinColumns = @JoinColumn(name = "company_id"))
//    @MapKeyColumn(name = "lang")
//    @Column(name = "description")
//    private Map<String, String> locales = new HashMap<>();

}
