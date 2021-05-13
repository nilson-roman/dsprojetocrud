package com.devsuperior.dsprojeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsprojeto.entities.Client;
import com.devsuperior.dsprojeto.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> findAll(){
		return clientRepository.findAll();
	}
}
