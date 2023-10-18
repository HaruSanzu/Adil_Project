package com.example.adil_prooject.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class RepoA implements RepoInt {

    @Override
    public void method() {
        System.out.println("Repo a method called");
    }
}
