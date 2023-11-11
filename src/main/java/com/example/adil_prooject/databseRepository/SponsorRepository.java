package com.example.adil_prooject.databseRepository;

import com.example.adil_prooject.models.Sponsors;
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
public class SponsorRepository {
    private DataSource dataSource;

    @Autowired

    public SponsorRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Sponsors> getSponsors() throws SQLException {
        Statement stmt = dataSource.getConnection().createStatement();
        ResultSet result = stmt.executeQuery("SELECT * from sponsors");
        List<Sponsors> sponsors = new ArrayList<>();
        while (result.next()){
            long id = result.getLong("id");
            String name = result.getString("name");
            String activity = result.getString("activity");
            Sponsors sponsor = Sponsors.builder().id(id).name(name).activity(activity).build();
            sponsors.add(sponsor);
        }
        return sponsors;
    }
}
