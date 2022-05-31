package com.company;

import java.util.ArrayList;

public class Mastermind {

    //Zulässige Farben: Weiß, Rot, Grün, Blau, Orange und Grau
    //Eine Farbe darf auch mehrmals verwendet werden
    public static String[] code = new String[4]; //zu erratende Lösung
    public static int spielzuege = 0;

    public static int correctColorsAndPositions(String[] arr){
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(code[i])){
                counter++;
            }
        }
        return counter;
    }

    public static int correctColors(String[] arr){
        int counter = 0;

        ArrayList<String> uebrigerCode = new ArrayList<>();
        ArrayList<String> uebrigePosFarb = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals(code[i])){
                uebrigePosFarb.add(arr[i]);
                uebrigerCode.add(code[i]);
            }
        }

        for(int j=0; j<uebrigerCode.toArray().length; j++){
            for(int k=0; k<uebrigePosFarb.toArray().length; k++){
                if(uebrigePosFarb.get(k).equals(uebrigerCode.get(j))){
                    counter++;
                    k=uebrigePosFarb.toArray().length;
                }
            }
        }

        return counter;


    }

    public static String guess(String[] arr){
        if(spielzuege < 12){
            spielzuege++;
            if(correctColorsAndPositions(arr) == 4){
                return "Du hast alle Farben an der richtigen Position. Herzlichen Glückwunsch! :)";
            }else{
                return "Richtige Farbe und richtige Position: " + correctColorsAndPositions(arr) + "              " + "Richtige Farben: " + correctColors(arr);
            }

        }else{
            return "Leider verloren :(";
        }



    }
}
