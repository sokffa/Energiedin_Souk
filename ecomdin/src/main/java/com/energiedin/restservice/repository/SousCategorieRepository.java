package com.energiedin.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.energiedin.restservice.entity.SousCategorie;

@RestResource(exported = false)
public interface SousCategorieRepository extends JpaRepository<SousCategorie, Integer> {

}