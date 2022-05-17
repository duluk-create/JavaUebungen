package com.company;

import java.util.ArrayList;

public class NameSplit {

    public static ArrayList nameSplit(String name){
        char[] arr = name.toCharArray();
        ArrayList<String> output = new ArrayList<>();
        String speicher = "";
        for(int i=0; i<name.length();i++){
            if(arr[i] != ';'){
                speicher = speicher.concat(Character.toString(arr[i]));
            }
            else{
                output.add(speicher);
                speicher = "";
            }
        }
        if(!speicher.isEmpty()){
            output.add(speicher);
        }
        return output;
    }
}
