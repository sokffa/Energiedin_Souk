package com.energiedin.restservice.entity;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Categorie { 
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id; 
    String nom; 
    String desc;
    
    @ManyToOne
    @JoinColumn(name="id_boutique")
    Boutique boutique;
    
    @OneToMany(mappedBy = "parent",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("parent")
    private Set<SousCategorie> sousCategories;

   
    @OneToMany(mappedBy = "categorie",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("categorie")
    private Set<Produit> produits;
    
	public Boutique getBoutique() {
		return boutique;
	}
	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}
	public Set<SousCategorie> getSousCategories() {
		return sousCategories;
	}
	public void setSousCategories(Set<SousCategorie> sousCategories) {
		this.sousCategories = sousCategories;
	}
	public Set<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getName() {
        return nom;
    }
    public void setName(String name) {
        this.nom = name;
    }
    public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
    
    
}