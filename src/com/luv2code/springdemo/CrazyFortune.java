package com.luv2code.springdemo;

public class CrazyFortune implements FortuneService{

    @Override
    public String getFortune() {
        return "Dog will bite u";
    }
}
