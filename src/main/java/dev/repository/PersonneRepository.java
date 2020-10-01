package dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.entite.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {

	@Query("select p from Personne p where p.groupe=null")
	List<Personne> findAllQueded();
	
	@Query("select p from Personne p where p.groupe.id=?1")
	List<Personne> findAllByGroupe(int idGroupe);

}
