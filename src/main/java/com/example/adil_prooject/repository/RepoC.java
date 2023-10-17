package com.example.adil_prooject.repository;

import org.springframework.stereotype.Repository;

@Repository
public class RepoC implements RepoInt{

    @Override
    public void method() {
        System.out.println("Repo C method called");
    }
}