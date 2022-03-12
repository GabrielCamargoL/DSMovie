package com.gabrielcamargol.dsmovie.repositories;

import com.gabrielcamargol.dsmovie.entities.Score;
import com.gabrielcamargol.dsmovie.entities.ScorePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
  
}
