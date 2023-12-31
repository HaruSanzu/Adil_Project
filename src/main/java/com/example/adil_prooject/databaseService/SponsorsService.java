package com.example.adil_prooject.databaseService;

import com.example.adil_prooject.databseRepository.SponsorRepository;
import com.example.adil_prooject.models.Sponsors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class SponsorsService {
    private SponsorRepository sponsorRepository;

    @Autowired

    public SponsorsService(SponsorRepository sponsorRepository) {
        this.sponsorRepository = sponsorRepository;
    }

}
