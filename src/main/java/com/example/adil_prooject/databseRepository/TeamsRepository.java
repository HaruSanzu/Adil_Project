package com.example.adil_prooject.databseRepository;

import com.example.adil_prooject.models.Teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamsRepository {
    private DataSource dataSource;

    @Autowired

    public TeamsRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

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

    public void addTeam(Teams teams) throws SQLException{
        PreparedStatement statement = dataSource.getConnection().prepareStatement("INSERT INTO teams(id,name,team_country) VALUES (?,?,?)");
        statement.setLong(1,teams.getId());
        statement.setString(2, teams.getName());
        statement.setString(3, teams.getTeam_country());
        statement.execute();
    }

    public void delete(long id) throws SQLException{
        PreparedStatement statement = dataSource.getConnection().prepareStatement("DELETE from teams where id = ?");
        statement.setLong(1, id);
        statement.execute();
    }


    public Teams findById(long findId) throws SQLException {
        Statement stmt = dataSource.getConnection().createStatement();
        ResultSet result = stmt.executeQuery("SELECT * from teams");
        List<Teams> teams = new ArrayList<>();
        while (result.next()) {
            long id = result.getLong("id");
            String name = result.getString("name");
            String team_country = result.getString("team_country");
            Teams team = Teams.builder().id(id).name(name).team_country(team_country).build();
            if (id == findId) return team;
        }
        return new Teams();
    }
}
