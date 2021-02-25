package fr.training.dao;

import fr.training.dao.jpa.CategorieDaoJpaImpl;

public class DaoProvider {
	
	public static CategorieDaoJpaImpl getCategorieDao() {
		return new CategorieDaoJpaImpl();
	}
}
