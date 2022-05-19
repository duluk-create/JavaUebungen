package com.company;

public class RahmenHinzufuegen {

    public static void frameWordList(String[] text){
        String lS = "";
        for (String s : text) {
            if (s.length() >= lS.length()) {
                lS = s;
            }
        }
        String starsTB = "****"; //Starte bereits mit 4 Sternen um über das Wort hinaus zu stehen
        for(int j=0; j<lS.length(); j++){
            starsTB = starsTB.concat("*");
        }
        System.out.println(starsTB);

        for (String s : text) {
            String space = " "; //ein Leerzeichen grundsätzlich hinzufügen
            for (int l = 0; l < lS.length() - s.length(); l++) {
                space = space.concat(" "); //je nach Länge des Wortes zum Vergleichswort weitere hinzufügen
            }
            System.out.println("* " + s + space + "*");
        }
        System.out.println(starsTB);


    }


}
