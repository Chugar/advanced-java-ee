package fr.training.dao.jpa;

import java.util.Collections;
import java.util.List;

import javax.persistence.RollbackException;

import fr.training.dao.PokemonDao;
import fr.training.domain.PokemonEntity;

public class PokemonDaoJpaImpl extends DaoJpa implements PokemonDao {

	@Override
	public List<PokemonEntity> findAll() {
		
		List<PokemonEntity> pokemons = this.em
				.createQuery("SELECT p FROM PokemonEntity p", PokemonEntity.class)
				.getResultList();
		
		if( pokemons.isEmpty() ) {
			return Collections.emptyList();
		}
		
		return pokemons;
	}

	
	@Override
	public PokemonEntity findById(int id) {
		return null;
	}

	@Override
	public PokemonEntity add(PokemonEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PokemonEntity save(PokemonEntity entity) {
		
		PokemonEntity pokemon;
		
		try {
			this.em.getTransaction().begin();
			pokemon = this.em.merge(entity);
			this.em.getTransaction().commit();
			return pokemon;
			
		} catch (RollbackException e) {
			e.printStackTrace();
			return null;
			
		}
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
