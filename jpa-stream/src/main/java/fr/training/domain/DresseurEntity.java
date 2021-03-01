package fr.training.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	@OneToMany(
		mappedBy = "dresseur",
		cascade = CascadeType.ALL, 
		fetch = FetchType.LAZY			
	)
	List<PokemonEntity> pokemons = new ArrayList<>();

	
	
	public DresseurEntity() { }

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Double getArgent() {
		return argent;
	}

	public void setArgent(Double argent) {
		this.argent = argent;
	}

	public DresseurTitle getTitle() {
		return title;
	}

	public void setTitle(DresseurTitle title) {
		this.title = title;
	}

	public List<PokemonEntity> getPokemons() {
		return pokemons;
	}

	public void setPokemons(List<PokemonEntity> pokemons) {
		this.pokemons = pokemons;
	}

}
