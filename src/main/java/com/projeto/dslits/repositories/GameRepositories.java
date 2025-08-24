package com.projeto.dslits.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.dslits.entities.Game;

public interface GameRepositories extends JpaRepository <Game, Long>{
	

}
