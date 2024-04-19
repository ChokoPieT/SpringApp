package com.example.Spring.service.impl;

import com.example.Spring.models.People;
import com.example.Spring.repository.PeopleRepository;
import com.example.Spring.service.PeopleService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class PeopleServiceImpl implements PeopleService {

    private final PeopleRepository repository;

    @Override
    public List<People> findAllPeople() {
        return repository.findAll();
    }

    @Override
    public People savePeople(People people) {
        return repository.save(people);
    }

    @Override
    public People findByEmail(String email) {
        return repository.findPeopleByEmail(email);
    }

    @Override
    public People updatePeople(People people) {
        return repository.save(people);
    }

    @Override
    public void deletePeople(String email) {
        repository.deleteByEmail(email);
    }
}
