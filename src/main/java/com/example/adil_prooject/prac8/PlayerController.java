package com.example.adil_prooject.prac8;

import com.example.adil_prooject.databaseService.PlayersService;
import com.example.adil_prooject.models.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/player")
public class PlayerController {
    private PlayersService playersService;

    @Autowired
    public PlayerController(PlayersService playersService) {
        this.playersService = playersService;
    }

    @GetMapping("/getAllPlayers")
    public List<Players> getAllPlayers(){
        return playersService.findAllPlayersNative();
    }

}
