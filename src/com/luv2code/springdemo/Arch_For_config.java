package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Arch_For_config {



    @Bean
    public FortuneService crazyFortune() {return new CrazyFortune();}

    @Bean
    public Coach archeryCoach() {return new ArcheryCoach(crazyFortune());}
}
