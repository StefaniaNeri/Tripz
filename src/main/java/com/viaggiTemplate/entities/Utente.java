package com.viaggiTemplate.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_utente;
	
	private String nome, email, password, role;
	
	@OneToMany(mappedBy = "utente", cascade = CascadeType.MERGE)
	@JsonBackReference
	private Set<Prenotazione> prenotazioni = new HashSet<Prenotazione>();

	public int getId_utente() {
		return id_utente;
	}

	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(Set<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	
	

}
