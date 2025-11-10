package com.infy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.infy.entity.Player;

import jakarta.transaction.Transactional;

@Transactional
public interface PlayerRepository extends PagingAndSortingRepository<Player, Integer>, CrudRepository<Player, Integer> {
    public List<Player> findAll();

    void deleteById(Integer playerId);

    // public String deleteByPlayerId(Integer playerId);
    // public static final Pageable page = new Pageable();

    // public String updatePlayerById(Integer id, Player player);

    // List<PlayerDTO> getFirstSevenPlayers(int pageNo, int pageSize);

    // // List<Player> findByDebutDateAfter(String debutDate, Pageable page);
    // List<PlayerDTO> findByCountryOrderByRankingAsc(String country, Sort sort);

    // List<PlayerDTO> findByDebutDateAfter(String debutDate, int i, int j);

    // List<PlayerDTO> getAllPlayersSortedByRanking(Sort sort) throws
    // InfyPlayerException;

}