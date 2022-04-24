package com.company;

public class Partnervermittlung {

    public static String interestsMatch(boolean[] personA, boolean[] personB){

        if(personA.length != personB.length){
            return 0 + "%";
        }                                                           //nicht alle Fragen beantwortet => 0%
        int counter =0;

        for(int i=0; i<personA.length; i++){
            if(personA[i] == personB[i]){
                counter++;
            }
                                                                //vergleiche immer und gebe Prozentzahl aus
        }
        return (counter*100/personA.length) + "%";
    }
}
