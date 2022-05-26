package com.company;

public class FernBedienung {


    public static Object[][] senderArr = new Object[30][30];
    public static int senderPos = 0;
    public static void setzeSender(){
        senderArr = new Object[][]{{1, "ARD"}, {2, "ZDF"}, {3, "BibelTV"}, {4, "Das Erste"}, {5, "VOX"}, {6, "DMAX"},
                {7, "ProSieben"}, {8, "ARTE"}, {9, "n-tv"}, {10, "Sixx"}, {11, "MTV"}, {12, "nickelodeon"}, {13, "Eurosport"}, {14, "DisneyChannel"}, {15, "SuperRTL"}, {16, "KIKA"}, {17, "RTL2"}, {18, "BR"},
                {19, "SWR"}, {20, "MDR"}, {21, "Tele5"}, {22, "kabel eins"}, {23, "3sat"}, {24, "HR"}, {25, "RBB"}, {26, "ZDFneo"}, {27, "ProSieben Maxx"}, {28, "N24 Doku"}, {29, "Phoenix"}, {30, "Welt"}};
    }


    public static String aktuellerSender(int nummer){
        senderPos = nummer--;
        return senderArr[nummer][0].toString() + " " + senderArr[nummer][1].toString();
    }

    public static String speicherSender(int nummer, String sender){

        senderArr[nummer-1][0] = nummer;
        senderArr[nummer-1][1] = sender;

        return "Der Sender wurde gespeichert";
    }

    public static String umschaltenHoch(){
        if(senderPos != 29){
            senderPos++;
        }
        else{
            senderPos = 0;
        }
        return senderArr[senderPos][0].toString() + " " + senderArr[senderPos][1];
    }

    public static String umschaltenRunter(){
        if(senderPos != 0){
            senderPos--;
        }
        else{
            senderPos = 29;
        }
        return senderArr[senderPos][0].toString() + " " + senderArr[senderPos][1];
    }

}
