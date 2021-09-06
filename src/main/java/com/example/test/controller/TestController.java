package com.example.test.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import  com.example.test.entity.Personne;
import com.example.test.exception.ResourceNotFoundException;
import com.example.test.repository.PersonRepository;


@RestController
@RequestMapping("/api/personnes")
public class TestController {

	@Autowired
    private PersonRepository userRepository;

    // get all users
    @GetMapping
    public List <Personne> getAllUsers() {
        return this. userRepository.findAll();
    }

    // get user by id
    @GetMapping("/{id}")
    public Personne getUserById(@PathVariable(value = "id") long PersonneId) {
        return this.userRepository.findById(PersonneId)
            .orElseThrow(()-> new ResourceNotFoundException("User not found with id :" + PersonneId));
    }

    // create user
    @PostMapping
    public Personne createUser(@RequestBody Personne user) {
        return this.userRepository.save(user);
    }
}
