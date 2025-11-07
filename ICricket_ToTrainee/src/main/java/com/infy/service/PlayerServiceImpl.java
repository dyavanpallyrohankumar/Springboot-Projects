package com.infy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.infy.dto.PlayerDTO;
import com.infy.entity.Player;
import com.infy.exception.InfyPlayerException;
import com.infy.repository.PlayerRepository;

@Service("bookService")
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	PlayerRepository repository;

	@Override
	public List<PlayerDTO> getFirstSevenPlayers(int pageNo, int pageSize) throws InfyPlayerException {
		// return repository.getFirstSevenPlayers(pageNo, pageSize);
		return null;
	}

	@Override
	public List<PlayerDTO> getAllPlayersByDebutDateAfter(String debutDate, int i, int j) throws InfyPlayerException {
		// return repository.findByDebutDateAfter(debutDate, i, j);
		return null;
	}

	@Override
	public List<PlayerDTO> getAllPlayersSortedByRanking(Sort sort) throws InfyPlayerException {
		// return repository.getAllPlayersSortedByRanking(sort);
		return null;
	}

	@Override
	public List<PlayerDTO> getAllPlayersOfCountrySortedByRanking(String country, Sort sort) throws InfyPlayerException {
		// return repository.findByCountryOrderByRankingAsc(country, sort);
		return null;
	}

	@Override
	public List<Player> findAll() {
		return repository.findAll();
	}

	public PlayerDTO save(Player body) {
		Player player = new Player(body.getRanking(), body.getPlayerName(), body.getCountry(), body.getDebutDate(),
				body.getBattingStyle(), body.getBowlingStyle());
		Player saved = repository.save(player);
		return new PlayerDTO(saved.getPlayerId(), saved.getPlayerName(), saved.getRanking(), saved.getBattingStyle(),
				saved.getBowlingStyle(), saved.getDebutDate(), saved.getCountry());
	}

	@Override
	public String deletePlayerById(Integer id) {
		if (id == null) {
			return "Invalid ID";
		}
		Optional<Player> playerOptional = repository.findById(id);
		if (playerOptional.isPresent()) {
			Player player = playerOptional.get();
			repository.deleteByPlayerId(id);
			return player.getPlayerName() + " Player Deleted Successfully";
		}
		return "Not Found";
	}

	@Override
	public Optional<Player> findByPlayerId(Integer param) {
		if (param == null) {
			return Optional.empty();
		}
		return repository.findById(param);
	}

	// @Override
	// public String updatePlayer(Integer id, Player player) {
	// return repository.updatePlayerById(id, player);
	// }

}