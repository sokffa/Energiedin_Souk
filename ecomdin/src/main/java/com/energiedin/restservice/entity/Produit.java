package com.energiedin.restservice.entity;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Produit {
	
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)	
   private int  codeProduit ;
   private String   nom_produit ;
   private double  prix ;
   private int  stock ;
   private String  photo ;
   private double  TVA ;
   
   @ManyToOne
   @JoinColumn(name="id_categorie") 
   @JsonIgnoreProperties("produits")
   private Categorie categorie;
   

   @ManyToOne
   @JoinColumn(name="id_boutique") 
   @JsonIgnoreProperties("produits")
   private Boutique boutique;
   
   @OneToMany(mappedBy = "produit",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JsonIgnoreProperties("produit")
   private Set<LignesCommande> lignescommande;

public Set<LignesCommande> getLignescommande() {
	return lignescommande;
}

public void setLignescommande(Set<LignesCommande> lignescommande) {
	this.lignescommande = lignescommande;
}

public Boutique getBoutique() {
	return boutique;
}
   
public void setBoutique(Boutique boutique) {
	this.boutique = boutique;
}   
   
public int getCodeProduit() {
	return codeProduit;
}
public void setCodeProduit(int codeProduit) {
	this.codeProduit = codeProduit;
}
public String getNom_produit() {
	return nom_produit;
}
public void setNom_produit(String nom_produit) {
	this.nom_produit = nom_produit;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public Categorie getCategorie() {
	return categorie;
}
public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public double getTVA() {
	return TVA;
}
public void setTVA(double tVA) {
	TVA = tVA;
}
}
