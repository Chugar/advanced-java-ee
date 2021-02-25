package fr.training.dao;

import fr.training.dao.jpa.ArticleDaoJpaImpl;
import fr.training.dao.jpa.CategorieDaoJpaImpl;

public class DaoProvider {
	
	public static CategorieDaoJpaImpl getCategorieDao() {
		return new CategorieDaoJpaImpl();
	}
	
	public static ArticleDaoJpaImpl getArticleDao() {
		return new ArticleDaoJpaImpl();
	}
}
