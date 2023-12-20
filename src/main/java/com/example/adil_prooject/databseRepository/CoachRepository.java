package com.example.adil_prooject.databseRepository;

import com.example.adil_prooject.models.Coachs;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends JpaRepository<Coachs, Long> {
   Coachs findCoachsById(long id);

   Coachs findCoachsByNicknameEndingWithIgnoreCase(String nickname);

   @Query(value = "SELECT * from Coachs c WHERE c.country = :country", nativeQuery = true)
   Coachs findCoachsByCountry(@Param("country") String country);

   @Modifying
   @Transactional
   @Query("UPDATE Coachs c SET c.team = :team where c.id = :id")
   Integer updateTeamById(@Param("id") long id, @Param("team") String team);
}
