package com.example.adil_prooject.databaseService;

import com.example.adil_prooject.databseRepository.CoachRepository;
import com.example.adil_prooject.models.Coachs;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CoachsService {
    private CoachRepository coachRepository;

    @Autowired

    public CoachsService(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    public Coachs findCoachsById(long id){
       return  coachRepository.findCoachsById(id);
    }

   public Coachs findCoachsByCountry(String country){
        return coachRepository.findCoachsByCountry(country);
   }

   public Coachs findCoachsByNicknameEndingWithIgnoreCase(String nickname){
        return coachRepository.findCoachsByNicknameEndingWithIgnoreCase(nickname);
   }

   public Integer updateTeamById(long id, String team){
        return coachRepository.updateTeamById(id, team);
   }

   public List<Coachs> findAllCoachsNative(){
        return coachRepository.findAllCoachsNative();
   }

   public Coachs deleteCoachsById(long id){
        return coachRepository.deleteCoachsById(id);
   }

   public Coachs addCoach(long id, String nickname, String name, String surname, String country, String team){
        Coachs newCoach = new Coachs();
        newCoach.setId(id);
        newCoach.setNickname(nickname);
        newCoach.setName(name);
        newCoach.setSurname(surname);
        newCoach.setCountry(country);
        newCoach.setTeam(team);
        return coachRepository.save(newCoach);
   }
}
