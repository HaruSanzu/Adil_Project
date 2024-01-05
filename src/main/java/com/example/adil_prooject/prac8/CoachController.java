package com.example.adil_prooject.prac8;

import com.example.adil_prooject.databaseService.CoachsService;
import com.example.adil_prooject.models.Coachs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/{id}/UpdateTeam")
    public Integer updateCoach(@PathVariable long id,@RequestParam String team){
        return coachsService.updateTeamById(id, team);
    }

    @DeleteMapping("/removeCoach/{id}")
    public Coachs removeCoach(@PathVariable("id") long id){
        return coachsService.deleteCoachsById(id);
    }




}
