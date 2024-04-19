package com.example.Spring.service.impl;

import com.example.Spring.models.People;
import com.example.Spring.repository.InMemoryPeopleDAO;
import com.example.Spring.service.PeopleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryPeopleServiceImpl implements PeopleService {

    private final InMemoryPeopleDAO repository;

    @Override
    public List<People> findAllPeople() {
        return repository.findAllPeople();
    }

    @Override
    public People savePeople(People people) {
        return repository.savePeople(people);
    }

    @Override
    public People findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public People updatePeople(People people) {
        return repository.updatePeople(people);
    }

    @Override
    public void deletePeople(String email) {
        repository.deletePeople(email);
    }
}
