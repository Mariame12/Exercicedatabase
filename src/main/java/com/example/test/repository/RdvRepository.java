package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.entity.Rdv;

public interface RdvRepository  extends JpaRepository<Rdv, Long> {

}
