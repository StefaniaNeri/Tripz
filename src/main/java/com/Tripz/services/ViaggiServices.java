package com.Tripz.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Tripz.entities.Prenotazione;
import com.Tripz.entities.Utente;
import com.Tripz.entities.Viaggio;

@Service
public interface ViaggiServices {

	List<Utente> getUtenti();
	List<Viaggio> getViaggi();
	List<Prenotazione> getPrenotazioni();
	
	Utente addUtente(Utente u);
	Viaggio addViaggio(Viaggio v);
	Prenotazione addPrenotazione(Prenotazione p);
	
	Utente updUtente(Utente u);
	Viaggio updViaggio(Viaggio v);
	Prenotazione updPrenotazione(Prenotazione p);
	
	void delUtente(Utente u);
	void delViaggio(Viaggio v);
	void delPrenotazione(Prenotazione p);
}
