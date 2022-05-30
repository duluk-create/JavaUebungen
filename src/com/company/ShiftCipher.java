package com.company;

import java.util.Arrays;

public class ShiftCipher {

    public static int key = 0;

    public static String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static String encipher(String eingabe){
        String[] arr = eingabe.split("");
        String[] arrOut = new String[eingabe.length()];
        for(int i=0; i<arr.length; i++){
            if(key < alphabet.length){
                if(Arrays.asList(alphabet).indexOf(arr[i])+key < alphabet.length){
                    arrOut[i] = alphabet[Arrays.asList(alphabet).indexOf(arr[i]) + key];

                }
                else{
                    arrOut[i] = alphabet[(Arrays.asList(alphabet).indexOf(arr[i]) + key)-alphabet.length];
                }
            }
            else{
                return "Bitte einen key zwischen 1 und 25 angeben!";
            }
        }

        String output = "";

        for(String s : arrOut){
            output = output.concat(s);
        }
        return output;
    }


    public static String decipher(String eingabe){
        String[] arr = eingabe.split("");
        String[] arrOut = new String[eingabe.length()];
        for(int i=0; i<arr.length; i++){
            if(key < alphabet.length){
                if(Arrays.asList(alphabet).indexOf(arr[i])-key > 0){
                    arrOut[i] = alphabet[Arrays.asList(alphabet).indexOf(arr[i]) - key];

                }
                else if((Arrays.asList(alphabet).indexOf(arr[i]) - key) != 0){
                    arrOut[i] = alphabet[(Arrays.asList(alphabet).indexOf(arr[i]) - key)+alphabet.length];
                }
                else{
                    arrOut[i] = alphabet[0];
                }
            }
            else{
                return "Bitte einen key zwischen 1 und 25 angeben!";
            }
        }

        String output = "";

        for(String s : arrOut){
            output = output.concat(s);
        }
        return output;
    }


}
