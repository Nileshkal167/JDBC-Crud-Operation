package com.jdbc1.rest.service;

import com.jdbc1.rest.entity.Passenger;
import com.jdbc1.rest.entity.PassengerInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@Service
public interface PassengerService {

    Passenger getPassengerById(int id) throws SQLException, IOException;
    public int addPassenger(Passenger passenger) throws SQLException, IOException;
    public String updatePassenger(Passenger passenger) throws SQLException, IOException;
    public List<Passenger> getAllPassengers() throws SQLException, IOException;



}
