package com.example.adil_prooject.databseRepository;

import com.example.adil_prooject.models.Sponsors;
import com.example.adil_prooject.models.Teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface SponsorRepository extends JpaRepository<Sponsors, Long> {

}

