package com.example.adil_prooject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceD {
@Autowired
    private ServiceC serviceC;

    public ServiceD(ServiceC serviceC) {
        this.serviceC = serviceC;
    }

    public void methodD(){
    System.out.println("Class methodD method called");
    serviceC.methodC();
}
}
