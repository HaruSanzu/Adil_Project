package com.example.adil_prooject.databseRepository;

import com.example.adil_prooject.models.Coachs;
import com.example.adil_prooject.models.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CoachRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired

    public CoachRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Coachs> findAll(){
        return jdbcTemplate.query("SELECT * FROM coachs", new BeanPropertyRowMapper<>(Coachs.class));
    }

    public Coachs findbyId(Integer id){
        return jdbcTemplate.queryForObject("SELECT * FROM coachs WHERE id = ?", new BeanPropertyRowMapper<>(Coachs.class), id);
    }

    public int addCoach(Coachs coachs){
        return jdbcTemplate.update("INSERT INTO coachs (id,nickname,name,surname,country,team) VALUES (?,?,?,?,?,?)", coachs.getId(),coachs.getNickname(),coachs.getName(),coachs.getSurname(),coachs.getCountry(),coachs.getTeam());
    }

    public int deleteName(String name){
        return jdbcTemplate.update("DELETE from coachs where name = ?", name );
    }

    public Coachs findbyName(String name){
        return jdbcTemplate.queryForObject("SELECT * from coachs Where name = ?", new BeanPropertyRowMapper<>(Coachs.class), name);
    }
}
