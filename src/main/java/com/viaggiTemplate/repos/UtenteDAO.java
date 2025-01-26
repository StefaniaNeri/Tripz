package com.viaggiTemplate.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viaggiTemplate.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
