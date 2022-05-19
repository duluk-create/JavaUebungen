package com.company;

public class SandUhr {

        public static void sandUhr(int width){
            int stop = 0;
            int l=0;
            for(int j=width; j>0;j--,j--, l++) {
                for(int m = l; m>0; m--) {
                    System.out.print(" ");
                }
                for (int i = 0; i < j; i++) {
                    System.out.print("#");
                }
                System.out.println();
                stop = j+2;
            }
            int n=l-2;

            for(int k=stop-1; k<width; k++,k++, n--){
                for(int o = n; o>0; o--){
                    System.out.print(" ");
                }
                for(int i=k+1; i>0 ;i--){
                    System.out.print("#");
                }
                System.out.println();
            }


        }

}
