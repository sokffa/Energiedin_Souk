package com.energiedin.restservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Boutique {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    
	@OneToMany(mappedBy = "boutique",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("boutique")
    private Set<Produit> produits;
    
    @OneToMany(mappedBy = "boutique",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("boutique")
    private Set<Categorie> categories;
    
    @OneToOne
    @JoinColumn(name = "id_proprietaire")
    private Proprietaire proprietaire;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	 public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public Set<Produit> getProduits() {
			return produits;
		}

		public void setProduits(Set<Produit> produits) {
			this.produits = produits;
		}

		public Set<Categorie> getCategories() {
			return categories;
		}

		public void setCategories(Set<Categorie> categories) {
			this.categories = categories;
		}
		
		public Proprietaire getProprietaire() {
			return proprietaire;
		}

		public void setProprietaire(Proprietaire proprietaire) {
			this.proprietaire = proprietaire;
		}


}