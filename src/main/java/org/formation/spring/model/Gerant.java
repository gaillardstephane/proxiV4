package org.formation.spring.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Gerant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idGearnt;
	private String nomGerant;
	private String prenomGerant;
	private String loginGerant;
	
	@OneToMany(mappedBy="gerant",cascade= {CascadeType.PERSIST})
	private Collection<Conseiller> listConseiller = new ArrayList<>();

	public Gerant(int idGearnt, String nomGerant, String prenomGerant, String loginGerant,
			Collection<Conseiller> listConseiller) {
		super();
		this.idGearnt = idGearnt;
		this.nomGerant = nomGerant;
		this.prenomGerant = prenomGerant;
		this.loginGerant = loginGerant;
		this.listConseiller = listConseiller;
	}

	public Gerant() {
		super();
	}

	/**
	 * @return the idGearnt
	 */
	public int getIdGearnt() {
		return idGearnt;
	}

	/**
	 * @param idGearnt the idGearnt to set
	 */
	public void setIdGearnt(int idGearnt) {
		this.idGearnt = idGearnt;
	}

	/**
	 * @return the nomGerant
	 */
	public String getNomGerant() {
		return nomGerant;
	}

	/**
	 * @param nomGerant the nomGerant to set
	 */
	public void setNomGerant(String nomGerant) {
		this.nomGerant = nomGerant;
	}

	/**
	 * @return the prenomGerant
	 */
	public String getPrenomGerant() {
		return prenomGerant;
	}

	/**
	 * @param prenomGerant the prenomGerant to set
	 */
	public void setPrenomGerant(String prenomGerant) {
		this.prenomGerant = prenomGerant;
	}

	/**
	 * @return the loginGerant
	 */
	public String getLoginGerant() {
		return loginGerant;
	}

	/**
	 * @param loginGerant the loginGerant to set
	 */
	public void setLoginGerant(String loginGerant) {
		this.loginGerant = loginGerant;
	}

	/**
	 * @return the listConseiller
	 */
	public Collection<Conseiller> getListConseiller() {
		return listConseiller;
	}

	/**
	 * @param listConseiller the listConseiller to set
	 */
	public void setListConseiller(Collection<Conseiller> listConseiller) {
		this.listConseiller = listConseiller;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gerant [idGearnt=" + idGearnt + ", nomGerant=" + nomGerant + ", prenomGerant=" + prenomGerant
				+ ", loginGerant=" + loginGerant + ", listConseiller=" + listConseiller + "]";
	}
	
	
	
	
}
