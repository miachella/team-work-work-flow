package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.Groupe;

public interface GroupeRepository extends JpaRepository<Groupe, Integer> {

}
