package com.jdbc1.rest.entity;

public class Passenger
{
    private int passsengerId;
    private String passengerName;
    private String passeengerEmail;

    public Passenger() {
    }

    public Passenger(int passsengerId, String passengerName, String passeengerEmail) {
        this.passsengerId = passsengerId;
        this.passengerName = passengerName;
        this.passeengerEmail = passeengerEmail;
    }

    public int getPasssengerId() {
        return passsengerId;
    }

    public void setPasssengerId(int passsengerId) {
        this.passsengerId = passsengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPasseengerEmail() {
        return passeengerEmail;
    }

    public void setPasseengerEmail(String passeengerEmail) {
        this.passeengerEmail = passeengerEmail;
    }
}
