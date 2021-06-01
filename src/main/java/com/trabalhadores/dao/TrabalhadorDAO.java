package com.trabalhadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalhadores.model.Trabalhador;

public interface TrabalhadorDAO extends JpaRepository<Trabalhador, Long> {

}
