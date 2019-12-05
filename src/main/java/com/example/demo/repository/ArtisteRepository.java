package com.example.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.Artiste;

public interface ArtisteRepository extends JpaRepositoryImplementation<Artiste, Integer>{

}
