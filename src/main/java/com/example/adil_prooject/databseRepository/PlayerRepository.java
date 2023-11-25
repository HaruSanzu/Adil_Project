package com.example.adil_prooject.databseRepository;

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
public interface PlayerRepository extends JpaRepository<Players,Long> {

    Players findPlayersByNameContainingIgnoreCase(String name);

    Players findPlayersById(long id);

    @Query(value = "select * from Players p", nativeQuery = true)
    List<Players> findAllPlayersNative();

    @Query("SELECT p from Players p where p.nickname = :nickname")
    Players findPlayersByNickname(@Param("nickname") String nickname);
}

