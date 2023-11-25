package com.example.adil_prooject;

import com.example.adil_prooject.databaseService.CoachsService;
import com.example.adil_prooject.databaseService.PlayersService;
import com.example.adil_prooject.databaseService.SponsorsService;
import com.example.adil_prooject.databaseService.TeamsService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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

		log.info("All players:{}", playersService.list());

		log.info("findPlayersByNameContainingIgnoreCase:{}", playersService.findPlayersByNameContainingIgnoreCase("Rus"));

		log.info("findPlayersById:{}", playersService.findPlayersById(4));

		log.info("findCoachsById:{}", coachsService.findCoachsById(3));

		log.info("findCoachsByCountry:{}",coachsService.findCoachsByCountry("Denmark"));
	}

}

