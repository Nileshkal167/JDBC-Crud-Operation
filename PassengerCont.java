package com.jdbc1.rest.controller;


import com.jdbc1.rest.entity.Passenger;
import com.jdbc1.rest.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@RestController
@RequestMapping("/passenger")
public class PassengerCont
{
    @Autowired
    PassengerService passengerService;
    @GetMapping("/{passengerId}")
   public Passenger getPassengerDetails(@PathVariable String passengerId)
   {
       try {
           return passengerService.getPassengerById(Integer.parseInt(passengerId));
       } catch (SQLException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
   @PostMapping("/add")
   public int addPassenger(@RequestBody Passenger passenger){
       try {
           return passengerService.addPassenger(passenger);
       } catch (SQLException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

}
