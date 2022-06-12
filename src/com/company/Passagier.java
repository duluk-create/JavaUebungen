package com.company;

public class Passagier {
    private String firstname;
    private String lastname;
    private String title;
    private boolean checkIn;

    private boolean atGate;

    public Passagier(String firstname, String lastname, String title){
        this.firstname = firstname;
        this.lastname = lastname;
        this.checkIn = false;
        this.atGate = false;
        this.title = title;
    }

    public void checkIn(){
        this.checkIn = true;
    }

    public boolean isCheckIn(){
      return checkIn;
    }

    public void onGate(){
        this.atGate = true;
    }

    public boolean isAtGate(){
        return atGate;
    }

    public String toString(){
        if(title.equals("")){
            return firstname + " " + lastname;
        }
        else{
            return title + " " + firstname + " " + lastname;
        }
    }
}


