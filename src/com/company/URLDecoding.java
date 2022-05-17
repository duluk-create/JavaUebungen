package com.company;

public class URLDecoding {

    public static String urlEncoding(String url){
        String output = url;
        if(url.contains(" ")){
            output = output.replace(" ", "%20");
        } if(url.contains("*")){
            output = output.replace("*", "%2A");
        } if(url.contains("+")){
            output = output.replace("+", "%2B");
        } if(url.contains(",")){
            output = output.replace(",", "%2C");
        } if(url.contains("/")){
            output = output.replace("/", "%2F");
        } if(url.contains(":")){
            output = output.replace(":", "%3A");
        } if(url.contains(";")){
            output = output.replace(";", "%3B");
        } if(url.contains("=")){
            output = output.replace("=", "%3D");
        } if(url.contains("?")){
            output = output.replace("?", "%3F");
        }
        return output;

    }
}
