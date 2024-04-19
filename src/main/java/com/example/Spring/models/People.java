package com.example.Spring.models;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;

@Data
@Entity
public class People {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    @Transient
    private int age;
    @Column(unique = true)
    private String email;

}
