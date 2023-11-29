package com.example.adil_prooject.databaseService;

import com.example.adil_prooject.databseRepository.PlayerRepository;
import com.example.adil_prooject.models.Players;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PlayersService {
    private PlayerRepository playerRepository;

    @Autowired
    public PlayersService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

   public List<Players> list(){
        return playerRepository.findAll();
    }

    public Players findPlayersByNameContainingIgnoreCase(String name){
        return playerRepository.findPlayersByNameContainingIgnoreCase(name);
    }

    public Players findPlayersById(long id){
        return playerRepository.findPlayersById(id);
    }

    public List<Players> findAllPlayersNative(){
        return playerRepository.findAllPlayersNative();
    }

    public Players findPlayersByNickname(String nickname){
        return playerRepository.findPlayersByNickname(nickname);
    }
}

