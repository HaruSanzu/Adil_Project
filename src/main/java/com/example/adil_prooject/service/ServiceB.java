package com.example.adil_prooject.service;

import com.example.adil_prooject.repository.RepoB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service("myCustomBean2")
public class ServiceB {
    @Autowired
    private RepoB repoB;

    private ServiceA serviceA;

    @Value("${attribute_value:this is default}")
    private String attribute;

    public ServiceB(ServiceA serviceA, RepoB repoB) {
        this.serviceA = serviceA;
        this.repoB = repoB;
    }


    public void methodB(){
        System.out.println("Attribute:" + attribute + ' ' + "Class ServiceB method called");
        repoB.method();
        serviceA.methodServiceA();
    }

}
