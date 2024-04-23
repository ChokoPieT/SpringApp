package com.example.Spring.controllers;

import com.example.Spring.models.People;
import com.example.Spring.service.PeopleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/people")
@AllArgsConstructor
public class PeopleController {

    private final PeopleService service;

    @GetMapping()
    public List<People> findAllPeople(){
        return service.findAllPeople();
    }

    @PostMapping("save_people")
    public String savePeople(@RequestBody People people){
        service.savePeople(people);
        return "People saved";
    }

    @GetMapping("/{email}")
    public People findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping("update_people")
    public People updatePeople(People people) {
        return service.updatePeople(people);
    }

    @DeleteMapping("delete_people/{email}")
    public void deletePeople(@PathVariable String email){
        service.deletePeople(email);
    }

}
