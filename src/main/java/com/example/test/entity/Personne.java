package com.example.test.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "fonction")
    private String fonction;
    
    @OneToMany(mappedBy = "personne", cascade = CascadeType.ALL)
    private Set<Rdv> rdv;

    
	public Personne() {
		
	}


	public Personne(long id, String nom, String prenom, String fonction) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getFonction() {
		return fonction;
	}


	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


	public Set<Rdv> getRdv() {
		return rdv;
	}


	public void setRdv(Set<Rdv> rdv) {
		this.rdv = rdv;
	}
	

   
}
