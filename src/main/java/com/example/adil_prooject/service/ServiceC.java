package com.example.adil_prooject.service;

import com.example.adil_prooject.repository.RepoC;
import com.example.adil_prooject.repository.RepoInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ServiceC {
    private ServiceB serviceB;
    private RepoInt repoInt;
    @Autowired


    public ServiceC(@Qualifier("myCustomBean2") ServiceB serviceB, RepoInt repoInt) {
        this.serviceB = serviceB;
        this.repoInt = repoInt;
    }

    public void methodC(){
        System.out.println("Class ServiceC method call");
        serviceB.methodB();
        repoInt.method();
    }
}
