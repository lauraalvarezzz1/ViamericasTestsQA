package com.selenium.viamericas.utility;

import java.util.Random;

public class DataGenerators {


    public static String generateAccountnumber (){
        Random rand = new Random();
        int pick = rand.nextInt(900)+1000;
        String num = "123"+Integer.toString(pick);
        return num;
    }

    public static String generateemails (){
        Random rand = new Random();
        int cons = rand.nextInt(900)+1;
        String num = "123"+Integer.toString(cons);
        return num;
    }
}

