package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.test.entity.Personne;
import com.example.test.entity.Rdv;
import com.example.test.repository.PersonRepository;
import com.example.test.repository.RdvRepository;
 @Service
public class RdvService {
	
		@Autowired
	private final RdvRepository rdvRepository;
	private final PersonRepository personneRepository;
	
	
	
	public RdvService(RdvRepository rdvRepository, PersonRepository personneRepository) {
		super();
		this.rdvRepository = rdvRepository;
		this.personneRepository = personneRepository;
	}
	public List<Rdv> getAll() {
		return rdvRepository.findAll();	
	}
	public Rdv createRdv( Rdv rdv) {
		return rdvRepository.save(rdv);
   }
	public Rdv createRdvforPersonne( Rdv rdv, long id) {
		Personne person =personneRepository.getById(id);
		
		rdv.setPersonne(person);	
		List<Rdv> listRV = rdvRepository.findByPersonne(person);
		
		for(Rdv s :listRV ) 
			
			if(s.getHeuredebut().equals(rdv.getHeuredebut()) && s.getHeurefin().equals(rdv.getHeurefin())) 
				return null;
		
		return rdvRepository.save(rdv);
		
	}	
}
