package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Artiste;
import com.example.demo.exceptions.RessourceNotFoundException;
import com.example.demo.repository.ArtisteRepository;

@RestController
public class ArtisteController {

	@Autowired
	ArtisteRepository artisteRepository;
	
	@GetMapping("/artistes")
	public List<Artiste> getAllArtistes() {
		return artisteRepository.findAll();
	}
	
	@GetMapping("/artiste/{id}")
	public ResponseEntity<Artiste> getArtisteById(@PathVariable Integer id) throws RessourceNotFoundException{		
		return ResponseEntity.of(artisteRepository.findById(id));
	}
	
}
