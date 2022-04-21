package com.adrianodrozdek.meuprimeiroprojeto.recursos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrianodrozdek.meuprimeiroprojeto.entities.Categoria;

@RestController
@RequestMapping(value = "/categoria")
public class RecursoDaCategoria {

	@GetMapping
	public ResponseEntity<List<Categoria>> findAll() {
		List<Categoria> list = new ArrayList<>();
		list.add(new Categoria(1L, "Eletronicos"));
		list.add(new Categoria(2L, "Caderno"));
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Categoria cat = new Categoria(1L, "Celular");
		return ResponseEntity.ok().body(cat);
	}
}
