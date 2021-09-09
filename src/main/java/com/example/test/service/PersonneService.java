package com.example.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.example.test.entity.Personne;
import com.example.test.exception.ResourceNotFoundException;
import com.example.test.repository.PersonRepository;
import java.util.List;

@Service
public class PersonneService {
	@Autowired
	private PersonRepository userRepository;
	
	//create entity
	public Personne createPersonne(Personne person) {
		return userRepository.save(person);
	}
	
	//list entity
	public List <Personne> savePersonne(List <Personne> person) {
		return userRepository.saveAll(person);
	}
	
	//getallUsers
	public List <Personne> getAllUsers() {
        return this. userRepository.findAll();
	}
	
	//getId
	
	public Personne getUserById( long PersonneId) {
        return this.userRepository.findById(PersonneId)
            .orElseThrow(()-> new ResourceNotFoundException("User not found with id :" + PersonneId));
    }
	
}
