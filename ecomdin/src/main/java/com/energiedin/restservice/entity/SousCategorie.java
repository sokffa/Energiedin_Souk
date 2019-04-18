package com.energiedin.restservice.entity;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class SousCategorie extends Categorie{
	
	@ManyToOne
    @JoinColumn(name="parent") 
    @JsonIgnoreProperties("sousCategories")
    Categorie parent ;

public Categorie getParent() {
	return parent;
}
public void setParent(Categorie parent) {
	this.parent = parent;
}

}	
