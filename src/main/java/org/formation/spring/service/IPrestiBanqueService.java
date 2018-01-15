package org.formation.spring.service;

import java.util.List;

import org.formation.spring.model.Client2;

public interface IPrestiBanqueService {
	
	
	public void addClient(Client2 c); 
	public List<Client2> listClients();
	public void	deleteClient(int idClient);
	public Client2 editClient(int idClient);
	public void	updateClient(Client2 c);
	//public List<Client>	chercherClients(String	motCle);

}
