package com.example.adil_prooject.databseRepository;

import com.example.adil_prooject.models.Coachs;
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
}
