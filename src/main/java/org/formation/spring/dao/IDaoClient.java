package org.formation.spring.dao;

import java.util.List;

import org.formation.spring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDaoClient  extends JpaRepository<Client,Integer>{
	List<Client> findAllClientByNom(String nom);

	List<Client> findAllClientByLogin(String login);
	
}
