package org.formation.spring.dao;

import org.formation.spring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDaoCompte extends JpaRepository<Client,Integer> {

}
