package com.viaggiTemplate.entities;

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
public class Viaggio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_viaggio;
	
	private String destinazione;
	private double prezzo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "id")
	private Prenotazione prenotazione;

	public int getId_viaggio() {
		return id_viaggio;
	}

	public void setId_viaggio(int id_viaggio) {
		this.id_viaggio = id_viaggio;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Prenotazione getPrenotazione() {
		return prenotazione;
	}

	public void setPrenotazione(Prenotazione prenotazione) {
		this.prenotazione = prenotazione;
	}

	
	
	
	

}
