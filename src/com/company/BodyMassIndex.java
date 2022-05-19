package com.company;

public class BodyMassIndex {
    public static float computeBMI(float weight, float height){
        return (float) Math.round((weight/Math.pow(height, 2))*10.0)/10;
    }

    public static String weightCategory(float bmi){
        if(bmi < 18.5){
            return "untergewichtig";
        }
        if(bmi > 18.5 && bmi <= 25){
            return "normalgewichtig";
        }  if(bmi > 25 && bmi <= 30){
            return "übergewichtig";
        }
        else{
            return "fettleibig";
        }
    }

    public static String outputBMI(float weight, float height){
        return "Mit einem BMI von " + computeBMI(weight, height) + " sind Sie " + weightCategory(computeBMI(weight, height)) + ".";
    }
}
