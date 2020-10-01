package dev.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.entite.Personne;
import dev.repository.PersonneRepository;

@Service
public class PersonneService {

	
	private PersonneRepository persRepo;

	public PersonneService(PersonneRepository persRepo) {
		this.persRepo = persRepo;
	}

	public List<Personne> getAll() {
		return persRepo.findAll();
	}
	
	
	
	
	
	
	
}
