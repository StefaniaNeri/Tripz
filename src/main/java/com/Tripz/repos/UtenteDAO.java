package com.Tripz.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tripz.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
