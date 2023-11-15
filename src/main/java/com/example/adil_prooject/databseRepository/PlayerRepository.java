package com.example.adil_prooject.databseRepository;

import com.example.adil_prooject.models.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PlayerRepository {
    private JdbcTemplate jdbcTemplate;
    @Autowired

    public PlayerRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Players> findAll(){
        return jdbcTemplate.query("SELECT * FROM players", new BeanPropertyRowMapper<>(Players.class));
    }

    public Players findbyId(Integer id){
        return jdbcTemplate.queryForObject("SELECT * FROM players WHERE id = ?", new BeanPropertyRowMapper<>(Players.class), id);
    }

    public int addPlayer(Players players){
       return jdbcTemplate.update("INSERT INTO players (id,nickname,name,surname,country) VALUES (?,?,?,?,?)", players.getId(),players.getNickname(),players.getName(),players.getSurname(),players.getCountry());
    }

    public int deleteName(String name){
        return jdbcTemplate.update("DELETE from players where name = ?", name );
    }

    public Players findbyName(String name){
        return jdbcTemplate.queryForObject("SELECT * from players Where name = ?", new BeanPropertyRowMapper<>(Players.class), name);
    }
}
