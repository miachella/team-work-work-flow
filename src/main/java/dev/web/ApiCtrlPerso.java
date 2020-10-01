package dev.web;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entite.Personne;
import dev.service.PersonneService;

@RestController
@CrossOrigin
@RequestMapping("personne")
public class ApiCtrlPerso {

	
	private PersonneService persSrv;

	public ApiCtrlPerso(PersonneService persSrv) {
		this.persSrv = persSrv;
	}
	
	@GetMapping
	public List<Personne> allPersonne() {
		return persSrv.getAll();
	}
	
}
