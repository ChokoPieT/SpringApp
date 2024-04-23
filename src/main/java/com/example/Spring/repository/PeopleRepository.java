package com.example.Spring.repository;

import com.example.Spring.models.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {
    void deleteByEmail(String email);

    People findPeopleByEmail(String email);
}
