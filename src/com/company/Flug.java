package com.company;

public class Flug {
    private String id;
    private String startAirport;
    private String endAirport;
    private String startTime;
    private String gate;
    private Passagier[] passengers;


    public Flug(
        String id, String startAirport, String endAirport, String startTime, String gate, Passagier[] passengers
    ){
        this.id = id;
        this.startAirport = startAirport;
        this.endAirport = endAirport;
        this.startTime = startTime;
        this.gate   = gate;
        this.passengers = passengers;
    }

    public void ausrufen(){
        for(int i=0; i<passengers.length; i++){
            if(passengers[i].isCheckIn() && !passengers[i].isAtGate()){
                System.out.println("Last call for passenger " + passengers[i]);
            }
        }
    }
}
