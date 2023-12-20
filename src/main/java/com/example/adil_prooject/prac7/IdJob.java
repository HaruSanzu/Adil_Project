package com.example.adil_prooject.prac7;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

import com.example.adil_prooject.databaseService.PlayersService;
import com.example.adil_prooject.databseRepository.PlayerRepository;
import com.example.adil_prooject.models.Players;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class IdJob implements Runnable {
    private PlayersService playersService;
    @Autowired
    public IdJob(PlayersService playersService) {
        this.playersService = playersService;
    }

    @Override
    public void run() {
        Iterable<Players> players = playersService.findAllPlayersNative();
        int x = 0;
        while (x < 10){
            log.info(String.valueOf(players));
            x++;
        }
    }
}
