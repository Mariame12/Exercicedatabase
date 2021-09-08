package com.example.test.controller;
import java.util.List;

//import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.test.ProjetDto.Projetdto;
import  com.example.test.entity.Personne;
//import com.example.test.exception.ResourceNotFoundException;
//import com.example.test.repository.PersonRepository;
import com.example.test.service.ProjetService;
//import com.example.test.repository.RdvRepository;


@RestController
@RequestMapping("/api/personnes")
public class TestController {

	@Autowired
	//private ModelMapper modelMapper;
   // private PersonRepository userRepository;
	//private  RdvRepository rvRepository;
	private ProjetService service;
	
	 @PostMapping("/add")
	 public Personne addPersonne(@RequestBody Personne user) {
	        return this.service.createPersonne(user);
	    }
	 @PostMapping("/addPersonnes")
	 public List <Personne> addPersonnes(@RequestBody List <Personne> user) {
	        return this.service. savePersonne(user);
	    }
	@GetMapping("/personnes")
	 public List <Personne> findAllPersonnes(){
		 return service.getAllUsers();
	 }
	
	 public Personne findAllPerrsonnes(@PathVariable(value = "id")long id) {
		 return service.getUserById(id);

	 }
}
