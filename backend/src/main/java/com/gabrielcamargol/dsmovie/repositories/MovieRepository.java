package com.gabrielcamargol.dsmovie.repositories;

import com.gabrielcamargol.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long>{
  
}
