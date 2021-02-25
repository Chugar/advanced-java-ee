package fr.training.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class CategorieEntity {
	
	@Id
	@Column(name = "cat_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "cat_nom", length = 50, nullable = false)
	private String nom;
	
	@ManyToOne
	@JoinColumn(name = "cat_id")
	private CategorieEntity parent;
	
	@OneToMany(mappedBy = "parent")
	private List<CategorieEntity> enfants;
	
	@ManyToMany
	@JoinTable(
			name = "categorie_article",
			joinColumns = @JoinColumn(name = "cat_id", referencedColumnName = "cat_id"),
			inverseJoinColumns = @JoinColumn(name = "article_id", referencedColumnName = "article_id")
			)
	private List<ArticleEntity> articles;

	public CategorieEntity() {
	}

	public CategorieEntity(String nom) {
		this.nom = nom;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public CategorieEntity getParent() {
		return parent;
	}

	public void setParent(CategorieEntity parent) {
		this.parent = parent;
	}

	public List<CategorieEntity> getEnfants() {
		return enfants;
	}

	public void setEnfants(List<CategorieEntity> enfants) {
		this.enfants = enfants;
	}

	public List<ArticleEntity> getArticles() {
		return articles;
	}

	public void setArticles(List<ArticleEntity> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Categorie [id=").append(id).append(", nom=").append(nom).append(", parent=").append(parent)
				.append(", enfants=").append(enfants).append(", articles=").append(articles).append("]");
		return builder.toString();
	}
	
}
