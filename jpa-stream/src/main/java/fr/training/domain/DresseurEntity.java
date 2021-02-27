package fr.training.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dresseur")
public class DresseurEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dresseur_id")
	private int id;
	
	@Column(name = "nom", length = 50, nullable = false)
	private String nom;
	
	@Column(name = "prenom", length = 50, nullable = false)
	private String prenom;
	
	@Column(name = "argent_total", precision = 10, scale = 2)
	private Double argent;
	
	@Column(name = "titre", length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private DresseurTitle title;
	
	// OneToMany Relation with pokemons here
}
