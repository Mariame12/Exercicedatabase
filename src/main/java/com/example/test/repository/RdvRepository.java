package com.example.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.entity.Personne;
import com.example.test.entity.Rdv;

public interface RdvRepository  extends JpaRepository<Rdv, Long> {
	List<Rdv> findByPersonne(Personne personne);
}
