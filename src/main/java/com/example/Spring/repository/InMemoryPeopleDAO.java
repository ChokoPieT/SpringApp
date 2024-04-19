package com.example.Spring.repository;

import com.example.Spring.models.People;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryPeopleDAO {

    private final List<People> PEOPLES = new ArrayList<>();

    public List<People> findAllPeople() {
        return PEOPLES;
    }

    public People savePeople(People people) {
        PEOPLES.add(people);
        return null;
    }

    public People findByEmail(String email) {
        return PEOPLES.stream().filter(element -> element.getEmail().equals(email)).findFirst().orElse(null);
    }

    public People updatePeople(People people) {
        var peopleIndex = IntStream.range(0, PEOPLES.size()).filter(index -> PEOPLES.get(index).getEmail()
                .equals(people.getEmail())).findFirst().orElse(-1);
        if (peopleIndex > -1){
            PEOPLES.set(peopleIndex, people);
            return people;
        }
        return null;
    }

    public void deletePeople(String email) {
        var people = findByEmail(email);
        if (people != null){
            PEOPLES.remove(people);
        }
    }
}
