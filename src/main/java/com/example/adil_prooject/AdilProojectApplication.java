package com.example.adil_prooject;

import com.example.adil_prooject.databaseService.CoachsService;
import com.example.adil_prooject.databaseService.PlayersService;
import com.example.adil_prooject.databaseService.SponsorsService;
import com.example.adil_prooject.databaseService.TeamsService;
import com.example.adil_prooject.models.Coachs;
import com.example.adil_prooject.models.Players;
import com.example.adil_prooject.models.Sponsors;
import com.example.adil_prooject.models.Teams;
import com.example.adil_prooject.prac7.AnJob;
import com.example.adil_prooject.prac7.IdJob;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.DataFormatException;


@SpringBootApplication()
@Slf4j
public class AdilProojectApplication {
	public static void main(String[] args){

		SpringApplication.run(AdilProojectApplication.class, args);
	}

}
