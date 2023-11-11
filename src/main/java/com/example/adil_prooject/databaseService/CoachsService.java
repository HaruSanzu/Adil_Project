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

    public List<Coachs> findAll(){
        return coachRepository.findAll();
    }
}
