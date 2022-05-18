package com.company;

import java.util.ArrayList;

public class GeheimSprache {

    public static String pigLatin(String eingabe){
        String[] arr = eingabe.split(" ");
        ArrayList<String> arr1 = new ArrayList<>();
        String output = "";

        for (String s : arr) { //für jeden String aus arr
            arr1.add((s.substring(1)).concat(s.substring(0, 1)).concat("ay"));
        }  //füge arr1  alles außer den ersten Buchstaben, den ersten Buchstaben und ay hinzu
        for(String t : arr1){//t ist dem jeweiligen String aus arr1 zugewiesen
            output = output.concat(t.concat(" "));
        }  //verbinde alles
        return output; //Ausgabe
    }

}
