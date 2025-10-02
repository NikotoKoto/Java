package com.example.Cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestCron {
/*
Scheduled (cron = seconds minutes hour dayofMonth month dayOfWeek)
 */
    @Scheduled(cron = "*/3 * * * * *")
    public void refreshDb(){
        System.out.println("db refresh");
    }
}
