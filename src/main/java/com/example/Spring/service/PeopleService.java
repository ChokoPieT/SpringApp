package com.example.Spring.service;

import com.example.Spring.models.People;

import java.util.List;

public interface PeopleService {

    List<People> findAllPeople();

    People savePeople(People people);

    People findByEmail(String email);

    People updatePeople(People people);

    void deletePeople(String email);
}
