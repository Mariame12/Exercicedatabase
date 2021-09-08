package com.example.test.service;

import java.util.List;

import com.example.test.entity.Personne;
import com.example.test.entity.Rdv;
public interface InterfaceService {
	//entity personnes
	List <Personne> getAllUsers();
	Personne createPersonne(Personne person);
	Personne getUserById( long PersonneId);
	
	//Rdv
	List <Rdv> getRdvs();
	Rdv createRdv(Rdv rdv);
	Rdv getRdvById( long Id);
}
