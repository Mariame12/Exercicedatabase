package com.example.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Rdv {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "heuredebut")
    private String heuredebut;

    @Column(name = "motif")
    private String motif;

    @Column(name = "heurefin")
    private String heurefin;
    
    @ManyToOne
    
    private Personne personne;

	public Rdv() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHeuredebut() {
		return heuredebut;
	}

	public void setHeuredebut(String heuredebut) {
		this.heuredebut = heuredebut;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getHeurefin() {
		return heurefin;
	}

	public void setHeurefin(String heurefin) {
		this.heurefin = heurefin;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Override
	public String toString() {
		return "Rdv [id=" + id + ", heuredebut=" + heuredebut + ", motif=" + motif + ", heurefin=" + heurefin
				+ ", personne=" + personne + "]";
	}
    
    


}
