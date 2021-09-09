package com.example.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entity.Rdv;
import com.example.test.service.RdvService;


@RequestMapping("/api/rdv")
@RestController


public class RdvController {
	
	private final RdvService rdvService;
	
	
	public RdvController(RdvService rdvService) {
		this.rdvService = rdvService;
	}
	@GetMapping("/list")
	public List<Rdv> getAll() {
		return rdvService.getAll();
		
	}
	@PostMapping("/create")
	public Rdv createRdv(@RequestBody Rdv rdv) {
		return rdvService.createRdv(rdv);
   }
	
	@PostMapping("/create/{id}")
	public Rdv createRdvforPersonne(@RequestBody Rdv rdv, @PathVariable long id) {
		
		return rdvService.createRdvforPersonne(rdv,id);
	}	
 
}