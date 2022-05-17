package com.company;

public class RueckwaertsAusgabe {
    public static String gebeRueckwaerts(String name){
        char[] arr =  name.toCharArray();
        char[] arr1 = new char[arr.length];

        for(int i=0; i<arr.length; i++){
            arr1[i] = arr[arr.length-1-i];
        }
        String result = new String(arr1);

        return result;
    }
}
