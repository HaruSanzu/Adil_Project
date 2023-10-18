package com.example.adil_prooject.service;

import com.example.adil_prooject.repository.RepoInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceC {
    private ServiceB serviceB;
    private RepoInt repoInt;
    @Autowired


    public ServiceC(ServiceB serviceB, RepoInt repoInt) {
        this.serviceB = serviceB;
        this.repoInt = repoInt;
    }

    public void methodC(){
        System.out.println("Class ServiceC method call");
        serviceB.methodB();
        repoInt.method();
    }
}
