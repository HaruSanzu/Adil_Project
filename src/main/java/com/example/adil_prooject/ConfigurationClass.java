package com.example.adil_prooject;

import com.example.adil_prooject.repository.RepoB;
import com.example.adil_prooject.repository.RepoC;
import com.example.adil_prooject.service.ServiceB;
import com.example.adil_prooject.service.ServiceC;
import com.example.adil_prooject.service.ServiceD;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.adil_prooject.repository.RepoA;
import com.example.adil_prooject.service.ServiceA;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:myprops.properties")
public class ConfigurationClass {
    @Value("${value.from.myprops:default}")
    private String value;
    @Bean("serviceAFromConfigurationClass")
    public ServiceA getServiceA(){
        ServiceA serviceA = new ServiceA(new RepoA());
        return serviceA;
    }

    @Bean("serviceCFromConfigurationClass")
    public ServiceC getServiceC(){
        ServiceC serviceC = new ServiceC(new ServiceB(new ServiceA(new RepoA()), new RepoB()), new RepoC());
        return  serviceC;
    }

   // @Bean("serviceDFromConfigurationClass")
   // public ServiceD getServiceD(){
     //   ServiceD serviceD = new ServiceD(new ServiceC(new ServiceB(new ServiceA(new RepoA()), new RepoB()), new RepoC()));
     //   return serviceD;
   // }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ServiceD getServiceD(){
        ServiceD serviceD = new ServiceD(new ServiceC(new ServiceB(new ServiceA(new RepoA()), new RepoB()), new RepoC()));
        serviceD.setAttribute(value);
        return serviceD;
    }
}
