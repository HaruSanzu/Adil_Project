package com.example.adil_prooject.service;

import com.example.adil_prooject.repository.RepoInt;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.DataFormatException;


@Service
@Slf4j
public class ServiceD {
    private ServiceC serviceC;

    private String attribute;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String value) {
        this.attribute = value;
    }
@Autowired

    public ServiceD(ServiceC serviceC) {
        this.serviceC = serviceC;
    }

    public void methodD() {
        System.out.println("Attribute:" + attribute + ' ' + "Class methodD method called");
        serviceC.methodC();
        try {
           System.out.println("Exception Service C:" + serviceC.throwError());
        } catch (DataFormatException e){
            log.error("threw");
        }
    }


    private void init() {
        System.out.println("method called before init");
        Assert.notNull(serviceC, "Service C not null");

    }

    private void destroy() {
        System.out.println("method called after all");
        serviceC = null;

    }

   @PostConstruct
    public void postConstruct() {
        log.info("Initializing bean using 'PostConstruct()'");
   }

   @PreDestroy
    public void preDestroy() throws IOException{
        log.info("@PreDestroy method called");
        if(serviceC == null){
            Files.deleteIfExists((Path) serviceC);
        }
   }




}
