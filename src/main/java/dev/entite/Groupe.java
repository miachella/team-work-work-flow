package dev.entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="groupe")
public class Groupe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;	
	@Column(name="nom", length=100, nullable = false)
	String nom;

	@OneToMany( targetEntity=Personne.class, mappedBy="groupe" )
    private List<Personne> participant = new ArrayList<>();
	
}
