package com.company;

import java.util.Locale;

public class MRAAlgorithmus {

    public static String matchRatingApproach(String eingabe){
        String gross = eingabe.toUpperCase(Locale.ROOT);
        String process = "";
        String output = "";

        if(isVovel(gross.charAt(0))){
            process = process.concat(Character.toString(gross.charAt(0)));
        }
        for(int i=0; i<gross.length(); i++){
            if(!isVovel(gross.charAt(i))){
                process = process.concat(Character.toString(gross.charAt(i)));

            }
        }

        String doppelt = "";
        for(int j=0; j<process.length(); j++){
            String l = Character.toString(process.charAt(j));
            if(!(l.equals(doppelt))){
                output = output.concat(l);
                doppelt = l;

            }
        }

        if(output.length() > 6){
            output = output.substring(0, 3).concat(output.substring(output.length()-3));
        }

        return output;
    }

    public static boolean isVovel(char b){
        return b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U';
    }



}
