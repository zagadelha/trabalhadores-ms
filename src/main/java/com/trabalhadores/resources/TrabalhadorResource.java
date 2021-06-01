package com.trabalhadores.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalhadores.dao.TrabalhadorDAO;
import com.trabalhadores.model.Trabalhador;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResource {

	@Autowired
	private TrabalhadorDAO dao;

	@GetMapping
	public ResponseEntity<List<Trabalhador>> getTrabalhadores() {
		List<Trabalhador> list = dao.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/{id}")
	private ResponseEntity<Trabalhador> getTrabalhador(@PathVariable Long id) {
		Trabalhador obj = dao.findById(id).get();
		return ResponseEntity.ok(obj);
	}

}
