package com.example.adil_prooject;

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


@SpringBootApplication
public class AdilProojectApplication {
	public static void main(String[] args){




		ConfigurableApplicationContext ctx = SpringApplication.run(AdilProojectApplication.class, args);
		//ServiceB serviceB = ctx.getBean("myCustomBean2", ServiceB.class);
		//serviceB.methodB();

		//ServiceC serviceCFromConfigurationClass = ctx.getBean("serviceCFromConfigurationClass", ServiceC.class);
		//serviceCFromConfigurationClass.methodC();

		//ServiceD serviceDFromConfigurationClass = ctx.getBean("serviceDFromConfigurationClass", ServiceD.class);
		//serviceDFromConfigurationClass.methodD();
		ServiceD serviceD = ctx.getBean("getServiceD", ServiceD.class);
		serviceD.methodD();



	}

}
