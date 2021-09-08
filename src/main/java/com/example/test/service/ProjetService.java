package com.example.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.example.test.entity.Personne;
import com.example.test.entity.Rdv;
import com.example.test.exception.ResourceNotFoundException;
import com.example.test.repository.PersonRepository;
import com.example.test.repository.RdvRepository;
import java.util.List;

@Service
public class ProjetService {
	@Autowired
	private PersonRepository userRepository;
	@Autowired
	private RdvRepository rdvRepository;
	
	//create entity
	public Rdv createRdv(Rdv rdv) {
		return rdvRepository.save(rdv);
	}
	
	
	public Personne createPersonne(Personne person) {
		return userRepository.save(person);
	}
	
	//list entity
	public List <Personne> savePersonne(List <Personne> person) {
		return userRepository.saveAll(person);
	}
	
	public List <Rdv> saveRdv(List <Rdv> rdv) {
		return rdvRepository.saveAll(rdv);
	}
	
	//getallUsers
	public List <Personne> getAllUsers() {
        return this. userRepository.findAll();
	}
	
	public List <Rdv> getRdvs() {
        return this. rdvRepository.findAll();
	}
	//getId
	
	public Personne getUserById( long PersonneId) {
        return this.userRepository.findById(PersonneId)
            .orElseThrow(()-> new ResourceNotFoundException("User not found with id :" + PersonneId));
    }
	public Rdv getRdvById( long Id) {
        return this.rdvRepository.findById(Id)
            .orElseThrow(()-> new ResourceNotFoundException("User not found with id :" + Id));
    }
}
