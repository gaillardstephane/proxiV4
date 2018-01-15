package org.formation.spring.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.formation.spring.dao.IDaoClient;
import org.formation.spring.model.Adresse;
import org.formation.spring.model.Client;
import org.formation.spring.model.Conseiller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class ServiceClient implements IServiceClient {

	@Autowired
	private IDaoClient daoClient;
	
	
	@Override
	public void addClient(Client c) {
		daoClient.save(c);
		
	}

	@Override
	public List<Client> listClients() {
		List<Client> listClients=daoClient.findAll();
		return listClients;
	}

	@Override
	public void deleteClient(int idClient) {
		daoClient.delete(idClient);
		
	}

	@Override
	public Client editClient(int idClient) {
		Client client=daoClient.findOne(idClient);
		return client;
	}

	@Override
	public void updateClient(Client c) {
		daoClient.save(c);
		
	}
	
	@PostConstruct
public void createSomeClient() {
	addClient(new Client(1, "Bob", "L'eponge", "email@gtm.com", new Adresse(24, "rue", "ville"), new Conseiller(1, "nomConseiller", "prenom")));
	addClient(new Client(2, "nom", "prenom", "email", new Adresse(21, "rue", "ville"), new Conseiller(2, "nomConseiller", "prenom")));
	
	
	}
	
}
