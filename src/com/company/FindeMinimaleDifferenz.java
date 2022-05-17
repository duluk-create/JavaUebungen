package com.company;

public class FindeMinimaleDifferenz {


    public static String minDistanz(int[] arr) {
        int diff = Integer.MAX_VALUE; //setze diff auf unendlich
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                if (diff > arr[i] - arr[i + 1]) {
                    diff = arr[i] - arr[i + 1];
                    index = i;
                }
            } else {
                if (diff > arr[i + 1] - arr[i]) {
                    diff = arr[i + 1] - arr[i];
                    index = i;
                }


            }
        }
        return "Die kleinste Differenz beträgt " + diff + " und befindet sich bei Index " + index;


    }
}
