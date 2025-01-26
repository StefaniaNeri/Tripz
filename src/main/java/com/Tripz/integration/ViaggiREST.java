package com.Tripz.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tripz.entities.Prenotazione;
import com.Tripz.entities.Utente;
import com.Tripz.entities.Viaggio;
import com.Tripz.services.ViaggiServices;

@RestController
@RequestMapping("api")
public class ViaggiREST {
	
	@Autowired
	private ViaggiServices vServ;
	
	
	@GetMapping("utenti")
	public ResponseEntity<List<Utente>> getUtenti() {
		return new ResponseEntity<>(vServ.getUtenti(), HttpStatus.OK);
	}
	
	
	@GetMapping("viaggi")
	public ResponseEntity<List<Viaggio>> getViaggi() {
		return new ResponseEntity<>(vServ.getViaggi(),HttpStatus.OK);
	}
	
	@GetMapping("prenotazioni")
	public ResponseEntity<List<Prenotazione>> getPrenotazioni() {
		return new ResponseEntity<>(vServ.getPrenotazioni(),HttpStatus.OK);
	}
	
	@PostMapping("utenti")
	public ResponseEntity<Utente> addUtente(@RequestBody Utente u) {
//		Utente utente = vServ.addUtente(u);
		return new ResponseEntity<>(vServ.addUtente(u), HttpStatus.CREATED);
	}
	
	@PostMapping("viaggi")
	public ResponseEntity<Viaggio> addViaggio(@RequestBody Viaggio v) {
		return new ResponseEntity<>(vServ.addViaggio(v), HttpStatus.CREATED);
	}
	
	@PostMapping("prenotazioni")
	public ResponseEntity<Prenotazione> addPrenotazionepost(@RequestBody Prenotazione p) {
		return new ResponseEntity<>(vServ.addPrenotazione(p), HttpStatus.CREATED);
	}

	
	@DeleteMapping("viaggi")
	public void deleteViaggio(@RequestBody Viaggio v) {
		vServ.delViaggio(v);
	}
}
