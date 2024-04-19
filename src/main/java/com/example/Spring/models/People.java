package com.example.Spring.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="peoples")
public class People {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private int age;
    @Column(unique = true)
    private String email;

}
