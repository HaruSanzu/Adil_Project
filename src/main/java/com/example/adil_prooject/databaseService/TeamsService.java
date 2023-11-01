package com.example.adil_prooject.databaseService;

import com.example.adil_prooject.databseRepository.TeamsRepository;
import com.example.adil_prooject.models.Teams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
@Service
@Slf4j
public class TeamsService {
    private TeamsRepository teamsRepository;
    @Autowired
    public TeamsService(TeamsRepository teamsRepository) {
        this.teamsRepository = teamsRepository;
    }
    public List<Teams> getTeams(){
        try{
            return teamsRepository.getTeams();
        } catch (SQLException e) {
            log.error("ERROR");
            return Collections.emptyList();
        }
    }
}
