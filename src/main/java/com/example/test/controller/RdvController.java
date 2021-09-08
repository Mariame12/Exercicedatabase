package com.example.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entity.Personne;
import com.example.test.entity.Rdv;
import com.example.test.repository.PersonRepository;
import com.example.test.repository.RdvRepository;

@RequestMapping("/api/rdv")
@RestController


public class RdvController {
	
	private final RdvRepository rdvRepository;
	private final PersonRepository personneRepository;
	
	public RdvController(RdvRepository rdvRepository,PersonRepository personneRepository) {
		this.rdvRepository = rdvRepository;
		this.personneRepository = personneRepository;
	}

	@GetMapping("/list")
	public List<Rdv> getAll() {
		return rdvRepository.findAll();
		
	}
	@PostMapping("/create")
	public Rdv createRdv(@RequestBody Rdv rdv) {
		return rdvRepository.save(rdv);
   }
	
	@PostMapping("/create/{id}")
	public Rdv createRdvforPersonne(@RequestBody Rdv rdv, @PathVariable long id) {
		Personne person =personneRepository.getById(id);
		rdv.setPersonne(person);
		return rdvRepository.save(rdv);
 }
}