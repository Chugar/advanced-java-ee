package fr.training.dao.jpa;

import static java.util.Collections.emptyList;

import java.util.List;

import fr.training.dao.DresseurDao;
import fr.training.domain.DresseurEntity;

public class DresseurDaoJpaImpl extends DaoJpa implements DresseurDao {
	
	private static final String SELECT_ALL = "SELECT d FROM DresseurEntity d";

	private static final String SELECT_BY_ID = "SELECT d FROM DresseurEntity d WHERE d.id = :id";
	
	private static final String DELETE = "DELETE FROM DresseurEntity d WHERE d.id = :id";
	
	@Override
	public List<DresseurEntity> findAll() {
		try {
			return em
					.createQuery(SELECT_ALL, DresseurEntity.class)
					.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emptyList();
	}

	@Override
	public DresseurEntity findById(int id) {
		try {
			return em
					.createQuery(SELECT_BY_ID, DresseurEntity.class)
					.setParameter("id", id)
					.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public DresseurEntity add(DresseurEntity entity) {
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
	public DresseurEntity save(DresseurEntity entity) {
		try {
			em.getTransaction().begin();
			if(entity.getId() > 0) {
				// UPDATE
				entity = em.merge(entity);
			} else {
				// INSERT
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
