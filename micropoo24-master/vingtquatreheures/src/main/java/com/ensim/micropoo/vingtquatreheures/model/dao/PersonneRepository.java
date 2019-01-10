package com.ensim.micropoo.vingtquatreheures.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ensim.micropoo.vingtquatreheures.model.Personne;

public interface PersonneRepository extends CrudRepository<Personne, Long> {

	@Query("select p from Personne p where p.lastName like ?1")
	List<Personne> findAllByName(String name);
	
	@Query("select p from Personne p where p.login = ?1")
	Personne findByLogin(String login);
}
