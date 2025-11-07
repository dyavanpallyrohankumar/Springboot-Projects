package com.infy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.PlayerDTO;
import com.infy.entity.Player;
import com.infy.service.PlayerService;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/players")
public class PlayersController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/")
    public String welcomeString() {
        return "Hello Welcome";
    }

    @GetMapping("/getall")
    public List<Player> getall() {
        return playerService.findAll();
    }

    @PostMapping("/save")
    public PlayerDTO savedata(@RequestBody Player body) {
        return playerService.save(body);
    }

    // @PutMapping("update/{id}")
    // public String putMethodName(@PathVariable Integer id, @RequestBody Player
    // player) {
    // return playerService.updatePlayer(id, player);
    // }

    @GetMapping("/search")
    public Optional<Player> searchPlayer(@RequestParam Integer id) {
        return playerService.findByPlayerId(id);
    }

    // @GetMapping("/delete/{id}")
    // public String deteteplayer(@PathVariable Integer id) {
    // return playerService.deletePlayerById(id);
    // }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePlayer(@PathVariable Integer id) {
        String message = playerService.deletePlayerById(id);
        return ResponseEntity.ok(message);
    }

}
