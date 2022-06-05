package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "ice skate for half of hour";
    }
}
