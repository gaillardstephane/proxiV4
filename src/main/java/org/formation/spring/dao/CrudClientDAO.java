package org.formation.spring.dao;

import java.util.List;

import org.formation.spring.model.Client2;
import org.springframework.data.jpa.repository.JpaRepository;




public interface CrudClientDAO extends JpaRepository<Client2, Integer> {  



	List<Client2> findAllClientByNom(String nom);

	//List<Client2> findAllClientByLogin(String login);

}
