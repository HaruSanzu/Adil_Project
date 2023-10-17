package com.example.adil_prooject.service;

import com.example.adil_prooject.repository.RepoC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ServiceC {
    @Autowired
    private ServiceB serviceB;
    private RepoC repoC;

    public ServiceC(@Qualifier("myCustomBean2") ServiceB serviceB, RepoC repoC) {
        this.serviceB = serviceB;
        this.repoC = repoC;
    }

    public void methodC(){
        System.out.println("Class ServiceC method call");
        serviceB.methodB();
        repoC.method();
    }
}
