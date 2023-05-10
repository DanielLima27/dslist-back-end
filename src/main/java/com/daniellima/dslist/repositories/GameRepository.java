package com.daniellima.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniellima.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
