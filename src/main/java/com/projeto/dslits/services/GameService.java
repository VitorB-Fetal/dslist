package com.projeto.dslits.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.dslits.dto.GameMinDTO;
import com.projeto.dslits.entities.Game;
import com.projeto.dslits.repositories.GameRepositories;

@Service
public class GameService {

	
	@Autowired
	private GameRepositories gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
