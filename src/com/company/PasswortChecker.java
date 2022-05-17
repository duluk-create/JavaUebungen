package com.company;

public class PasswortChecker {

    public static boolean isStrong(String password){

        int counter = 0;
        if(password.length() >= 8){
            counter++;
            //password.contains(regex) geht nicht!
        }
        if(password.matches(".*\\p{Lower}.*")){
            counter++;
           //Sind Kleinbuchstaben enthalten?
        }
        if(password.matches(".*\\p{Upper}.*")){
            counter++;
            //Sind Großbuchstaben enthalten?
        }
        if(password.matches(".*\\d.*")){
            counter++;
            //Sind Zahlen enthalten?
        }
        if(password.matches(".*\\p{Punct}.*")){
            counter++;
            //Sind Sonderzeichen enthalten?
        }

        return counter == 5;
    }
}
