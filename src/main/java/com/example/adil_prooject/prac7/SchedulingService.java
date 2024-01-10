package com.example.adil_prooject.prac7;

import com.example.adil_prooject.databaseService.CoachsService;
import com.example.adil_prooject.databaseService.PlayersService;
import com.example.adil_prooject.models.Coachs;
import com.example.adil_prooject.models.Players;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SchedulingService {

    private PlayersService playersService;

    private CoachsService coachsService;

    @Autowired
    public SchedulingService(PlayersService playersService, CoachsService coachsService) {
        this.playersService = playersService;
        this.coachsService = coachsService;
    }



  //  @Scheduled(fixedDelay = 5000 )
   // public void fixedDelayTask(){
   //     Iterable<Players> players = playersService.findAllPlayersNative();
   //     log.info("all players:{}", players);
  //  }

    //@Scheduled(fixedRate = 5000)
    //public void fixedRateTask(){
    //    Iterable<Coachs> coachs = coachsService.findAllCoachsNative();
   //     log.info("all coachs:{}", coachs);
   // }

   // @Async
  //  @Scheduled(fixedRate = 2000)
   // public void fixedRateTask() {
    //    Iterable<Coachs> coachs = coachsService.findAllCoachsNative();
   //     log.info("all coachs:{}", coachs);
    //}

    @Scheduled(cron = "0/2 * * * * ?")
    public void cronExpTask(){
        Iterable<Players> players = playersService.findAllPlayersNative();
        Iterable<Coachs> coachs = coachsService.findAllCoachsNative();
        int x = 0;
        while (x < 10) {
            if (x % 2 == 0) {
                log.info("all players there:{}", players);
            } else if (x % 2 != 0) {
                log.info("all coachs there:{}", coachs);
            }
            x++;
        }
    }


    }
