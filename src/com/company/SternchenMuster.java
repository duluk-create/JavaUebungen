package com.company;

import java.util.ArrayList;

public class SternchenMuster {

    public static void sternchenMuster(int rows) {
        ArrayList<String> output = new ArrayList<>();
        String sternchen1 = "";

        for (int i = 0; i < rows - 1; i++) {
            sternchen1 = sternchen1.concat("*");
            output.add(sternchen1);
        }
        for (int j = 0; j < rows; j++) {
            sternchen1 = sternchen1.concat("*");
        }
        output.add(sternchen1);
        String leerzeichen = "";
        String sternchen2;
        for (int k = 0; k < rows; k++) {
            leerzeichen = leerzeichen.concat(" ");
        }
        int zaehler = 2;
        for (int l = 0; l < rows - 1; l++) {
            sternchen2 = leerzeichen.concat(output.get(rows - zaehler));
            output.add(sternchen2);
            sternchen2 = "";
            zaehler++;
        }
        for (int m = 0; m < output.toArray().length; m++) {
            System.out.println(output.get(m));
        }

    }

}
