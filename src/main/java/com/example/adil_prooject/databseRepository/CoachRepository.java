package com.example.adil_prooject.databseRepository;

import com.example.adil_prooject.models.Coachs;
import com.example.adil_prooject.models.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoachRepository extends JpaRepository<Coachs, Long> {
    Coachs findCoachsById(long id);


    @Query(value = "SELECT * from Coachs c WHERE c.country = :country", nativeQuery = true)
    Coachs findCoachsByCountry(@Param("country") String country);
}
