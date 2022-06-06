package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{

    @Autowired
    public HockeyCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "ice skate for half of hour";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
