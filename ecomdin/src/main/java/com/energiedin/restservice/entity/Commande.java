package com.energiedin.restservice.entity;

import java.util.Set;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Commande {
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)	
	   int numCommande ;
	   String  dateCommande ;
	   boolean  validated ;
	   
	   @OneToMany(mappedBy = "commande",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	    @JsonIgnoreProperties("commande")
    	Set<LignesCommande> lignescommande;

		@ManyToOne
	    @JoinColumn(name="id_client") 
		@JsonIgnoreProperties("commandes")
		private Client client;

		public Client getClient() {
			return client;
	   }
		public void setClient(Client client) {
		   this.client = client;
	   }	
	public Set<LignesCommande> getLignescommande() {
		return lignescommande;
   }
	public void setLignescommande(Set<LignesCommande> lignescommande) {
	   this.lignescommande = lignescommande;
   }
	public int getNumCommande() {
		return numCommande;
	}
	public void setNumCommande(int numCommande) {
		this.numCommande = numCommande;
	}
	public String getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}
	public boolean isValidation() {
		return validated;
	}
	public void setValidation(boolean validation) {
		this.validated = validation;
	}
	
}
