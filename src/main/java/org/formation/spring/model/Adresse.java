package org.formation.spring.model;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

@Component
@Embeddable
public class Adresse {

	private int numero;
	private String rue;
	private String ville;
	
	
	//Constructeurs
	public Adresse() {
		super();
	}


	public Adresse(int numero, String rue, String ville) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
	}

	//Getters Setters

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}


	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}


	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}


	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}


	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}


	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	//toString
	@Override
	public String toString() {
		return  numero + "   " + rue + "  " + ville ;
	}
	
	
	
	
	
}
