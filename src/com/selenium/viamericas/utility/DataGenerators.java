package com.selenium.viamericas.utility;

import java.util.Random;

public class DataGenerators {


    public static String generateAccountnumber (){
        Random rand = new Random();
        int pick = rand.nextInt(900)+1000;
        String num = "123"+Integer.toString(pick);
        return num;
    }

    public static String generateUnionId(){
        Random rand = new Random();
        int pick = rand.nextInt(900)+1000;
        String num = "123"+Integer.toString(pick);
        return num;
    }

}

