package fr.training.dao.jpa;

import java.util.List;

import javax.persistence.RollbackException;

import fr.training.dao.DresseurDao;
import fr.training.domain.DresseurEntity;

public class DresseurDaoJpaImpl extends DaoJpa implements DresseurDao {

	@Override
	public List<DresseurEntity> findAll() {
		return null;
	}

	@Override
	public DresseurEntity findById(int id) {
		return null;
	}

	@Override
	public DresseurEntity add(DresseurEntity entity) {
		return null;
	}

	@Override
	public DresseurEntity save(DresseurEntity entity) {
		
		DresseurEntity dresseur;
		try {
			
			this.em.getTransaction().begin();
			dresseur = this.em.merge(entity);
			this.em.getTransaction().commit();
			return dresseur;
			
		} catch (RollbackException e) {
			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteById(int id) {
		return false;
	}

}
