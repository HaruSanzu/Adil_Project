package com.example.adil_prooject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
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
    }

    private void init() {
        System.out.println("method called before init");
        Assert.notNull(serviceC, "Service C not null");

    }

    private void destroy() {
        System.out.println("method called after all");
        serviceC = null;

    }
}
