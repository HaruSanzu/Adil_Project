package com.example.adil_prooject.prac8;

import com.example.adil_prooject.databaseService.CoachsService;
import com.example.adil_prooject.models.Coachs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/coach")
public class CoachController {
    private CoachsService coachsService;

    @Autowired
    public CoachController(CoachsService coachsService) {
        this.coachsService = coachsService;
    }

    @GetMapping("/getCoach")
    public List<Coachs> getCoachs(){
        return coachsService.findAllCoachsNative();
    }
}
