package com.devsuperior.dsprojeto.resources;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsprojeto.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Linhares", "12345678910", 6000.0, Instant.parse("1980-01-01T00:00:00.00Z"), 0));
		list.add(new Client(2L, "Fausto", "98745678910", 2000.0, Instant.parse("1990-01-01T00:00:00.00Z"), 0));
		list.add(new Client(3L, "Edson", "78965478910", 3000.0, Instant.parse("2000-01-01T00:00:00.00Z"), 0));
		return ResponseEntity.ok().body(list);
	}
}
