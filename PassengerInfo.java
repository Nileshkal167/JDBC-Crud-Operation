package com.jdbc1.rest.entity;


import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class PassengerInfo {
    private String id;
    private String Name;
    private String Email;
    private String passengerId;

    //private Passenger passenger;

    public PassengerInfo(){
     }

    public PassengerInfo(String id, String name, String email, String studentId, Passenger passenger) {
        this.id = id;
        this.Name = name;
        this.Email = email;
        this.passengerId = passengerId;
        //this.passenger = passenger;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    /* public Passenger getPassenger() {
        return passenger;
    }

    /*public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public PassengerInfo(String id, String name, String email){


     }*/
}
