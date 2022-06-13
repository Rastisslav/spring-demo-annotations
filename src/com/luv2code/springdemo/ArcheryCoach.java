package com.luv2code.springdemo;

public class ArcheryCoach implements Coach{

    public FortuneService fortuneService;

    public ArcheryCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Blyat";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
