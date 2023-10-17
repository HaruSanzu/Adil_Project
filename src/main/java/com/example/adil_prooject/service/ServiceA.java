package com.example.adil_prooject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.example.adil_prooject.repository.RepoA;

@Service
public class ServiceA {
    @Autowired
    private RepoA repoA;

    @Value("My Bean Method")
    private String attribute;

    public ServiceA(RepoA repoA) {
        this.repoA = repoA;
    }

    public void methodServiceA(){
        System.out.println("Attribute" + attribute + ' ' + "Class ServiceA method called");
        repoA.method();
    }
}
