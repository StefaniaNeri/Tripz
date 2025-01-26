package com.viaggiTemplate.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viaggiTemplate.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
