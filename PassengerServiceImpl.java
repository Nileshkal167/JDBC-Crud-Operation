package com.jdbc1.rest.serviceimpl;

import com.jdbc1.rest.entity.Passenger;
import com.jdbc1.rest.entity.PassengerInfo;
import com.jdbc1.rest.repository.PassengerRepository;
import com.jdbc1.rest.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    PassengerRepository passengerDao;

    @Override
    public List<Passenger> getAllPassengers() throws SQLException, IOException {

        List<Passenger> passengers;

        return passengers= passengerDao.getAllPassengers();

    }

    @Override
    public Passenger getPassengerById(int id) throws SQLException, IOException {
        return passengerDao.getPassengerById(id);
    }

    @Override
    public int addPassenger(Passenger passenger) throws SQLException, IOException {
        return passengerDao.addPassenger(passenger);

    }

    @Override
    public String updatePassenger(Passenger passenger) throws SQLException, IOException {
        return null;
    }

//    @Override
//    public Passenger addPassenger(Passenger passenger) throws SQLException,IOException {
//        int count = passengerDao.addPassenger(passenger);
//        if(count>0){
//            return "Passenger deleted successfully!";
//        }
//        return "User not deleted!";
//    }
//    @Override
//    public String updatePassenger(Passenger passenger) throws SQLException,IOException{
//        int count = passengerDao.upda(passenger);
//        if (count>0){
//            return count +" Passenger updated successfully!";
//        }
//        return "Passenger not updated!";
//    }
}
