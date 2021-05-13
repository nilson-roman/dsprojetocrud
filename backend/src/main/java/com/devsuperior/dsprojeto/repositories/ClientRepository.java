package com.devsuperior.dsprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsprojeto.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	
}
