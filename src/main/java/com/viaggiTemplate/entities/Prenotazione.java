package com.viaggiTemplate.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date dataPrenotazione;
	
	@OneToMany(mappedBy = "prenotazione", cascade = CascadeType.MERGE)
	private Set<Viaggio> viaggi = new HashSet<Viaggio>();
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name= "id_utente")
	private Utente utente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}

	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

	

	public Set<Viaggio> getViaggi() {
		return viaggi;
	}

	public void setViaggi(Set<Viaggio> viaggi) {
		this.viaggi = viaggi;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	

}
