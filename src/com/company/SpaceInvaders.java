package com.company;

import java.util.Random;
import java.util.Scanner;

public class SpaceInvaders {

        public static Random zufall = new Random();

        public static int posSchiff = zufall.nextInt(8);

        public static void starteSpielfeld(){

            for(int i=0; i<5; i++){
                for(int j=0; j<8; j++){
                    if(i == 0){
                        System.out.print("o");
                    }
                    if(i == 4){
                        if(j == posSchiff){
                            System.out.print("V ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        public static void bewegeRaumschiff(){
            Scanner scanner = new Scanner(System.in);

            String scan = scanner.next();

            if (scan.equals("a")) {
                if(posSchiff > 0){
                    posSchiff--;
                }
                else{
                    posSchiff = 8;
                }
            }
            else if(scan.equals("d")){
                if(posSchiff < 7){
                    posSchiff++;
                }
                else{
                    posSchiff = 0;
                }
            }
            if(!scan.equals("x")){
                starteSpielfeld();
                bewegeRaumschiff();

            }
            scanner.close();
        }


    }

