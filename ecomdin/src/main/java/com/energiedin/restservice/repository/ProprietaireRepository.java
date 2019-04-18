package com.energiedin.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.energiedin.restservice.entity.Proprietaire;


public interface ProprietaireRepository extends  JpaRepository<Proprietaire ,String> {

}
