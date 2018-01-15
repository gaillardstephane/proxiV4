 package org.formation.spring.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Client2 extends Personne3  {
	
	private String login;
	
	private String motDePasse;
	
	@Autowired
	@Embedded
	private Adresse2 adresse;
	

	public Client2() {}

	public Client2(Adresse2 adresse) {
	    this.adresse = adresse;
	}
	

	/* (non-Javadoc)
	 * @see org.formation.spring.model.Personne#getId()
	 */
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	/* (non-Javadoc)
	 * @see org.formation.spring.model.Personne#setId(int)
	 */
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	/* (non-Javadoc)
	 * @see org.formation.spring.model.Personne#getNom()
	 */
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}

	/* (non-Javadoc)
	 * @see org.formation.spring.model.Personne#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom(nom);
	}

	/* (non-Javadoc)
	 * @see org.formation.spring.model.Personne#getPrenom()
	 */
	@Override
	public String getPrenom() {
		// TODO Auto-generated method stub
		return super.getPrenom();
	}

	/* (non-Javadoc)
	 * @see org.formation.spring.model.Personne#setPrenom(java.lang.String)
	 */
	@Override
	public void setPrenom(String prenom) {
		// TODO Auto-generated method stub
		super.setPrenom(prenom);
	}

	public Client2(String nom, String prenom, String login, String motDePasse, Adresse2 adresse) {
		super(nom,prenom);
		this.login = login;
		this.motDePasse = motDePasse;
		this.adresse = adresse;
	}

	public String toString() {
		 return " ID  : "+this.getId() +" - "+
		    	" Nom : "+this.getNom()+" - "+
		    	" Prénom : "+this.getPrenom() +" - "+
		    	" login : "+this.getLogin() +" - "+
		    	" Mot de passe : "+this.getMotDePasse() +" - "+
		    	" Adresse : "+this.getAdresse().toString();
		    		
		
	}


	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Adresse2 getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse2 adresse) {
		this.adresse = adresse;
	}
	

  
}
