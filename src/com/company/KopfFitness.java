package com.company;

import java.util.Random;

public class KopfFitness {

    public static int zahl1 = 0;
    public static int zahl2 = 0;

    public static String getExercise(){
        Random zufall = new Random();
        zahl1 = zufall.nextInt(19)+1;
        zahl2 = zufall.nextInt(19)+1;

        return zahl1 + " * " + zahl2 + " = ?";

    }

    public static String getResult(){
        return "Result:" + zahl1 *zahl2;
    }
}
