package com.example.adil_prooject.service;

import com.example.adil_prooject.repository.RepoB;
import com.example.adil_prooject.repository.RepoInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service("myCustomBean2")
public class ServiceB {
    private RepoInt repoInt;

    private ServiceA serviceA;

    @Value("${attribute_value:this is default}")
    private String attribute;

    @Autowired



    public ServiceB(ServiceA serviceA,@Qualifier("repoB") RepoInt repoInt) {
        this.serviceA = serviceA;
        this.repoInt = repoInt;
    }


    public void methodB(){
        System.out.println("Attribute:" + attribute + ' ' + "Class ServiceB method called");
        repoInt.method();
        serviceA.methodServiceA();
    }

}
