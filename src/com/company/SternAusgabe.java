package com.company;

import java.util.Scanner;

public class SternAusgabe {
    public static String sterneSehen(){

        Scanner keyboard=new Scanner(System.in);

        System.out.println("Wieviele Sterne möchtest du sehen?");

        int zahl = keyboard.nextInt();

        String output = "";

        while(zahl>0) {
            output = output.concat("*");
            zahl--;
        }

        return output;
    }
}
