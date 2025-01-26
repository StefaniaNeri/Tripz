package com.viaggiTemplate.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viaggiTemplate.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
