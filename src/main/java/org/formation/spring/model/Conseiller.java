package org.formation.spring.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Conseiller {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idConseiller;
	private String nomConseiller;
	private String prenom;
	private String login;
	
	@OneToMany(mappedBy="conseiller", cascade= {CascadeType.PERSIST})
	private Collection<Client> listClient= new ArrayList<>();

	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	private Gerant gerant;
	
	
	public Conseiller() {
		super();
	}

	

	public Conseiller(int idConseiller, String nomConseiller, String prenom, String login) {
		super();
		this.idConseiller = idConseiller;
		this.nomConseiller = nomConseiller;
		this.prenom = prenom;
		this.login = login;
	}



	public Conseiller(int idConseiller, String nomConseiller, String prenom) {
		super();
		this.idConseiller = idConseiller;
		this.nomConseiller = nomConseiller;
		this.prenom = prenom;
	}



	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}



	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}



	/**
	 * @return the idConseiller
	 */
	public int getIdConseiller() {
		return idConseiller;
	}

	/**
	 * @param idConseiller the idConseiller to set
	 */
	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	/**
	 * @return the nomConseiller
	 */
	public String getNomConseiller() {
		return nomConseiller;
	}

	/**
	 * @param nomConseiller the nomConseiller to set
	 */
	public void setNomConseiller(String nomConseiller) {
		this.nomConseiller = nomConseiller;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the listClient
	 */
	public Collection<Client> getListClient() {
		return listClient;
	}

	/**
	 * @param listClient the listClient to set
	 */
	public void setListClient(Collection<Client> listClient) {
		this.listClient = listClient;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Conseiller [idConseiller=" + idConseiller + ", nomConseiller=" + nomConseiller + ", prenom=" + prenom
				+ ", listClient=" + listClient + "]";
	}
	
	
}
