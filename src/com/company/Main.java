package com.company;

import javax.swing.*;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {




public static void main(String[] args){
        Passagier[] passagiere = {
                new Passagier("Martin", "Werle", ""),
                new Passagier("Iska", "Schwarz", "Dr.Dr.med."),
                new Passagier("Lukas", "Informatiker", "Prof."),
                new Passagier("Norbert", "Moedebeck", ""),
                new Passagier("Benjamin", "Müller", "Dr.Dr.Dr")
        };
        for(int i = 0; i < passagiere.length - 1; i++){
            passagiere[i].checkIn(); //jeder meiner Passagiere checkt ein außer der Letzte
            if(i > 8){
                passagiere[i].onGate(); //alle Passagiere größer 2 ohne den letzten sind am Gate
            }
        }

        Flug flug = new Flug("MH123", "Köln-Bonn", "München", "9:10", "C12", passagiere);

        flug.ausrufen();

}

}








