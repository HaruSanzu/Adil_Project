package com.example.adil_prooject;

import com.example.adil_prooject.databaseService.CoachsService;
import com.example.adil_prooject.databaseService.PlayersService;
import com.example.adil_prooject.databaseService.SponsorsService;
import com.example.adil_prooject.databaseService.TeamsService;
import com.example.adil_prooject.models.Coachs;
import com.example.adil_prooject.models.Players;
import com.example.adil_prooject.models.Sponsors;
import com.example.adil_prooject.models.Teams;
import com.example.adil_prooject.prac7.IdJob;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.sql.Connection;
import java.util.zip.DataFormatException;


@SpringBootApplication()
@Slf4j
public class AdilProojectApplication {
	public static void main(String[] args){



		ConfigurableApplicationContext ctx = SpringApplication.run(AdilProojectApplication.class, args);

		TeamsService teamsService = ctx.getBean("teamsService", TeamsService.class);

		PlayersService playersService = ctx.getBean("playersService", PlayersService.class);

		CoachsService coachsService = ctx.getBean("coachsService", CoachsService.class);

		SponsorsService sponsorsService = ctx.getBean("sponsorsService", SponsorsService.class);

		Connection connection;

		//Thread thread = new Thread(new IdJob(connection));



		log.info("findPlayersByNameContainingIgnoreCase:{}", playersService.findPlayersByNameContainingIgnoreCase("Rus"));

		log.info("findPlayersById:{}", playersService.findPlayersById(4));

		log.info("findCoachsById:{}", coachsService.findCoachsById(3));

		log.info("findCoachsByCountry:{}", coachsService.findCoachsByCountry("Denmark"));

		log.info("findAllPlayersNative:{}", playersService.findAllPlayersNative());

		log.info("findPlayersByNickname:{}", playersService.findPlayersByNickname("B1t"));

		log.info("findCoachsByNicknameEndingWithIgnoreCase:{}", coachsService.findCoachsByNicknameEndingWithIgnoreCase("nic"));

		log.info("updateTeamById:{}", coachsService.updateTeamById(2, "Virtus Pro"));

		log.info("findCoachsById:{}", coachsService.findCoachsById(2));




	}

}
