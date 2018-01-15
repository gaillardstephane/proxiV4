package org.formation.spring.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.formation.spring.dao.CrudClientDAO;
import org.formation.spring.model.Adresse2;
import org.formation.spring.model.Client2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service1")
public class PrestiBanqueServiceImplCrud implements IPrestiBanqueService {
	
	
	private static final Logger LOGGER =  LoggerFactory.getLogger(PrestiBanqueServiceImplCrud.class);

	@Autowired
	private CrudClientDAO crudClientDAO;

	@Override
	public void addClient(Client2 c) {
		crudClientDAO.save(c);
	}

	@Override
	public List<Client2> listClients() {
		crudClientDAO.findAll();
		LOGGER.debug("lister clients");
		LOGGER.info("information");
		return crudClientDAO.findAll();

	}

	@Override
	public void deleteClient(int idClient) {
		crudClientDAO.delete( idClient );
	}

	@Override
	public Client2 editClient(int idClient) {
		crudClientDAO.findOne(idClient);
		return new Client2();
	}

	@Override
	public void updateClient(Client2 c) {
		crudClientDAO.save(c);
	}

@PostConstruct
	public void createSomeClient() {
		addClient(new Client2("kogulan", "prenom1", "login", "motDePasse", new Adresse2(25, "rue1", "ville1")));
		addClient(new Client2("NhaThu", "prenom2", "login", "motDePasse", new Adresse2(25, "rue2", "ville2")));
	}

}
