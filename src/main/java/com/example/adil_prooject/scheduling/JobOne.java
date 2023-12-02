package com.example.adil_prooject.scheduling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JobOne implements Runnable{
    @Override
    public void run() {
        log.info("run runnable method");

    }
}
