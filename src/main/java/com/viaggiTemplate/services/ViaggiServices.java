package com.viaggiTemplate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.viaggiTemplate.entities.Prenotazione;
import com.viaggiTemplate.entities.Utente;
import com.viaggiTemplate.entities.Viaggio;

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
