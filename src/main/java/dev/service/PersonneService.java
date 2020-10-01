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

	public List<Personne> getAllQueded() {
		return persRepo.findAllQueded();
	}
	
	
	public List<Personne> getAllByGroupe(int idGroupe) {
		return persRepo.findAllByGroupe(idGroupe);
	}
	
	
	
	
}
