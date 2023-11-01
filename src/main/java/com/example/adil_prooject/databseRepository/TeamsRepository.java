package com.example.adil_prooject.databseRepository;

import com.example.adil_prooject.models.Teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamsRepository {
    @Autowired
    private DataSource dataSource;

    public List<Teams> getTeams() throws SQLException{
        Statement stmt = dataSource.getConnection().createStatement();
        ResultSet result = stmt.executeQuery("SELECT * from teams");
        List<Teams> teams = new ArrayList<>();
        while (result.next()){
            long id = result.getLong("id");
            String name = result.getString("name");
            String team_country = result.getString("team_country");
            Teams team = Teams.builder().id(id).name(name).team_country(team_country).build();
            teams.add(team);
        }
        return teams;
    }
}
