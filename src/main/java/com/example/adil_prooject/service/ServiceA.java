package com.example.adil_prooject.service;

import com.example.adil_prooject.repository.RepoInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.example.adil_prooject.repository.RepoA;

@Service
public class ServiceA {
    private RepoInt repoInt;


    @Value("My Bean Method")
    private String attribute;

    @Autowired
    public ServiceA(@Qualifier("repoA") RepoInt repoInt) {
        this.repoInt = repoInt;
    }

    public void methodServiceA(){
        System.out.println("Attribute" + attribute + ' ' + "Class ServiceA method called");
        repoInt.method();
    }
}
