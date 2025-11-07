package com.infy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;

import com.infy.dto.PlayerDTO;
import com.infy.entity.Player;
import com.infy.exception.InfyPlayerException;

public interface PlayerService {

	public List<PlayerDTO> getFirstSevenPlayers(int pageNo, int pageSize) throws InfyPlayerException;

	public List<PlayerDTO> getAllPlayersByDebutDateAfter(String debutDate, int i, int j) throws InfyPlayerException;

	public List<PlayerDTO> getAllPlayersSortedByRanking(Sort sort) throws InfyPlayerException;

	public List<PlayerDTO> getAllPlayersOfCountrySortedByRanking(String country, Sort sort) throws InfyPlayerException;

	public List<Player> findAll();

	public PlayerDTO save(Player body);

	public String deletePlayerById(Integer id);

	public Optional<Player> findByPlayerId(Integer param);

	// public String updatePlayer(Integer id, Player player);

}