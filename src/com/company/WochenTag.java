package com.company;

public class WochenTag {

    public static String findeWochentag(String datum){
        int tag = Integer.parseInt(datum.substring(0,2));
        int monat= Integer.parseInt(datum.substring(3,5));
        int jahr = Integer.parseInt(datum.substring(6,10));
        int jahran = Integer.parseInt(datum.substring(6, 8));  //Angabe des Jahrhunderts
        int jahrend = Integer.parseInt(datum.substring(8,10)); //letzen beiden Zahlen des Datums

        int[] monate = {6,1,4,4,0,2,5,0,3,6,1,4}; //Werte einzelner Monate beginnend mit Dezember

        int[] jhd = {2,0,6,4}; //18-21.Jhd

        String[] wochentage = {"Samstag", "Sonntag", "Montag", "Dienstag","Mittwoch","Donnerstag","Freitag"};

        int result = jahrend + jahrend/4 + tag;

        if(monat == 12){
            monat = 0;
        }

        result += monate[monat];

       switch(jahran){
           case 18:
               result += jhd[0];
               break;
           case 19:
               result += jhd[1];
               break;
               case 20:
               result += jhd[2];
               break;
               case 21:
               result += jhd[3];
               break;

        }
        if(jahr%4 == 0 && !(jahr%100 == 0) || jahr%400 == 0){
            if(monat == 1 || monat == 2){
                result -= 1;
            }
        }
        result %= 7;

        return wochentage[result];



    }

}
