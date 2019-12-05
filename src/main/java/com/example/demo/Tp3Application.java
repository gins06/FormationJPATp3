package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Agent;
import com.example.demo.entity.Artiste;
import com.example.demo.repository.ArtisteRepository;

@SpringBootApplication
public class Tp3Application {

	@Autowired
	ArtisteRepository artisteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Tp3Application.class, args);
	}
	
	@Bean
	CommandLineRunner init(ArtisteRepository artisteRepository){
		List<Artiste> artistesList = new ArrayList<Artiste>();
		artistesList.add(new Artiste("Willis", "Bruce", "Masculin",60, "USA", "0101011010", "bw@gmail.com", new Agent("Doug", "Mike", "Agents Prod")));
		artistesList.add(new Artiste("Dujardin", "Jean", "Masculin",45, "France", "0202020202", "JD@gmail.com", new Agent("Brown", "James", "Cine")));
		artistesList.add(new Artiste("Pitt", "Brad", "Masculin",50, "USA", "0202020202", "BP@gmail.com", new Agent("Melo", "Tony", "AB")));
	
		return args -> {
			artistesList.forEach(artiste -> artisteRepository.save(artiste));
		};
	}

}
