package com.example.adil_prooject;

import com.example.adil_prooject.databaseService.CoachsService;
import com.example.adil_prooject.databaseService.PlayersService;
import com.example.adil_prooject.databaseService.SponsorsService;
import com.example.adil_prooject.databaseService.TeamsService;
import com.example.adil_prooject.models.Coachs;
import com.example.adil_prooject.models.Players;
import com.example.adil_prooject.models.Sponsors;
import com.example.adil_prooject.models.Teams;
import com.example.adil_prooject.service.ServiceB;
import com.example.adil_prooject.service.ServiceC;
import com.example.adil_prooject.service.ServiceD;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.adil_prooject.service.ServiceA;

import java.util.zip.DataFormatException;


@SpringBootApplication()
@Slf4j
public class AdilProojectApplication {
	public static void main(String[] args){




		ConfigurableApplicationContext ctx = SpringApplication.run(AdilProojectApplication.class, args);
		//ServiceB serviceB = ctx.getBean("myCustomBean2", ServiceB.class);
		//serviceB.methodB();

		//ServiceC serviceCFromConfigurationClass = ctx.getBean("serviceCFromConfigurationClass", ServiceC.class);
		//serviceCFromConfigurationClass.methodC();

		//ServiceD serviceDFromConfigurationClass = ctx.getBean("serviceDFromConfigurationClass", ServiceD.class);
		//serviceDFromConfigurationClass.methodD();
		//ServiceD serviceD = ctx.getBean("getServiceD", ServiceD.class);
		//serviceD.methodD();

		TeamsService teamsService = ctx.getBean("teamsService", TeamsService.class);

		PlayersService playersService = ctx.getBean("playersService", PlayersService.class);

		CoachsService coachsService = ctx.getBean("coachsService", CoachsService.class);

		SponsorsService sponsorsService = ctx.getBean("sponsorsService", SponsorsService.class);

		Teams teams = Teams.builder().id(6).name("MOUZ").team_country("Germany").build();
		teamsService.addTeam(teams);

		Sponsors sponsors = Sponsors.builder().id(6).name("Betway").activity("bookmaker company").build();
		sponsorsService.addSponsor(sponsors);

		Players players = Players.builder().id(6).nickname("Karrigan").name("Finn").surname("Anderson").country("Denmark").build();


		Coachs coachs = Coachs.builder().id(6).nickname("B1ad3").name("Andrey").surname("Gorodenskiy").country("Ukraine").team("NaVi").build();

		coachsService.addCoach(coachs);


		playersService.addPlayer(players);

		playersService.deleteName("Finn");

		log.info("Teams - {}" , teamsService.getTeams());

		log.info("Teams with id 4:{}", teamsService.findById(4));

		log.info("Players - {}", playersService.findAll());

		log.info("Coachs - {}", coachsService.findAll());

		log.info("Sponsor - {}", sponsorsService.getSponsors());

		log.info("Sponsor with id 5:{}", sponsorsService.findById(5));

		log.info("Player with id 2:{}", playersService.findbyId(2));

		log.info("Player with name Russel:{}", playersService.findByName("Russel"));

		log.info("Coach with id 3:{}", coachsService.findbyId(3));

		log.info("Coach with name Konstantin:{}", coachsService.findByName("Konstantin"));


	}

}
