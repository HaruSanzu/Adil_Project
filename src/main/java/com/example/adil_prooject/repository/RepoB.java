package com.example.adil_prooject.repository;

import org.springframework.stereotype.Repository;

@Repository
public class RepoB implements RepoInt {

    @Override
    public void method() {
        System.out.println("Repo b method called");
    }
}
