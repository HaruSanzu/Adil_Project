package com.example.adil_prooject.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class RepoC implements RepoInt{

    @Override
    public void method() {
        System.out.println("Repo C method called");
    }
}