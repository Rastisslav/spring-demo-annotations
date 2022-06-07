package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


@Component
public class FileFortuneService implements FortuneService{

    List<String> listOfFortunes = new ArrayList<>();

    public FileFortuneService() {
        try {
            File myObj = new File("data-fortune");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                listOfFortunes.add(data);
               // System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //return listOfFortunes;
    }


    Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(listOfFortunes.size());

        return listOfFortunes.get(index);
    }
}
