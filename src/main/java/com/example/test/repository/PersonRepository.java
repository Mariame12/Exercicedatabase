package com.example.test.repository;
import  com.example.test.entity.Personne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Personne, Long>{

}
