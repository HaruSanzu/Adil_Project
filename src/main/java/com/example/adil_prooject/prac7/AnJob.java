package com.example.adil_prooject.prac7;

import com.example.adil_prooject.databaseService.CoachsService;
import com.example.adil_prooject.models.Coachs;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.concurrent.Callable;

public class AnJob implements Callable<Iterable<Coachs>> {
    private CoachsService coachsService;


    @Autowired
    public AnJob(CoachsService coachsService) {
        this.coachsService = coachsService;
    }


    @Override
    public Iterable<Coachs> call() throws Exception {
        long id = 0;
        Iterable<Coachs> coachs = Collections.singleton(coachsService.findCoachsById(id));
        int a = 0;
        while(a > 2){
            a++;
            id = 2;
            coachs = (Iterable<Coachs>) Collections.singleton(coachsService.findCoachsById(id));
        }
        return coachs;
    }
}
