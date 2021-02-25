package fr.training.dao.jpa;

import static java.util.Collections.*;

import java.util.List;

import fr.training.dao.CategorieDao;
import fr.training.domain.CategorieEntity;

public class CategorieDaoJpaImpl extends DaoJpa implements CategorieDao {
	
	private static final String SELECT_ALL = "SELECT c FROM Categorie c";
	
	private static final String SELECT_BY_ID = "SELECT c FROM Categorie c WHERE c.id = :id";
	
	private static final String DELETE = "DELETE FROM Categorie c WHERE c.id = :id";

	@Override
	public List<CategorieEntity> findAll() {
		try {
			return em
					.createQuery(SELECT_ALL, CategorieEntity.class)
					.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emptyList();
	}

	@Override
	public CategorieEntity findById(int id) {
		try {
			return em
					.createQuery(SELECT_BY_ID, CategorieEntity.class)
					.setParameter("id", id)
					.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CategorieEntity add(CategorieEntity entity) {
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CategorieEntity save(CategorieEntity entity) {
		try {
			em.getTransaction().begin();
			if (entity.getId() > 0) {
				// Si l'entity a un id, on fait un update
				entity = em.merge(entity);
			} else {
				// Sinon on fait un insert
				em.persist(entity);
			}
			em.getTransaction().commit();
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		try {
			em.getTransaction().begin();
			em
				.createQuery(DELETE)
				.setParameter("id", id)
				.executeUpdate();
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
