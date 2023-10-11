package com.example.adil_prooject;

import com.sun.tools.javac.Main;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import service.ServiceA;



@SpringBootApplication
public class AdilProojectApplication {
	public static void main(String[] args) {


		ConfigurableApplicationContext ctx = SpringApplication.run(AdilProojectApplication.class, args);
		ServiceA serviceAFromConfigurationClass = ctx.getBean("serviceAFromConfigurationClass", ServiceA.class);
		serviceAFromConfigurationClass.methodServiceA();
	}

}
