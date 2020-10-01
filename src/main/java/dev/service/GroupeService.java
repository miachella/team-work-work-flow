package dev.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.entite.Groupe;
import dev.repository.GroupeRepository;

@Service
public class GroupeService {
	private GroupeRepository grpRepo;

	public GroupeService(GroupeRepository grpRepo) {
		super();
		this.grpRepo = grpRepo;
	}

	public List<Groupe> getAll() {
		return grpRepo.findAll();
	}

}
