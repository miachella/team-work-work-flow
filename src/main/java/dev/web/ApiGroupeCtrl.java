package dev.web;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entite.Groupe;
import dev.entite.Personne;
import dev.service.GroupeService;

@RestController
@CrossOrigin
@RequestMapping("groupe")
public class ApiGroupeCtrl {

	private GroupeService grpSrv;

	public ApiGroupeCtrl(GroupeService grpSrv) {
		super();
		this.grpSrv = grpSrv;
	}
	
	@GetMapping
	public List<Groupe> allPersonne() {
		return grpSrv.getAll();
	}
	
	
	
}
