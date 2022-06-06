package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{

    @Autowired
    @Qualifier ("happyFortuneService")
    private FortuneService fortuneService;

    public HockeyCoach()
    { System.out.println(">> HOckeyCoach inside default constructor");}



    @Override
    public String getDailyWorkout() {
        return "ice skate for half of hour";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
