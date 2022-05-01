package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Morsecode {

    public static String morseCode(String zeichenkette){
        String zeichen = zeichenkette.toLowerCase(Locale.ROOT).replace("[\s]", "");

        char[] arr = zeichen.toCharArray();

        String[] kette = new String[zeichenkette.length()];

        for(int k=0; k<zeichenkette.length(); k++){
            kette[k] = Character.toString(arr[k]);
        }

        ArrayList<String> morseBuchstaben = new ArrayList<>(Arrays.asList("--..", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---","-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-","-.--"));
        ArrayList<String> buchstaben = new ArrayList<>(Arrays.asList("z", "a", "b", "c", "d" , "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"));
        ArrayList<String> morseZahlen = new ArrayList<>(Arrays.asList("-----",".----", "..---", "...--","....-", ".....", "--...","---..", "----."));

        ArrayList<String> output = new ArrayList<>();
        for(int i=0; i<zeichenkette.length(); i++){

            if(kette[i].matches("[0-9]")){
                int stelle = Integer.parseInt(kette[i]);
                output.add(morseZahlen.get(stelle));


            }
            if(kette[i].matches("[a-z]")){
                if(buchstaben.contains(kette[i])){
                    output.add(morseBuchstaben.get(buchstaben.indexOf(kette[i])));

                }
            }
        }
        String out = "";

        for(int j=0; j<output.toArray().length; j++){
            out = out.concat(output.get(j));
        }

        return out;

    }

}
