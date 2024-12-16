package com.jdbc1.rest.repository;


import com.jdbc1.rest.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class PassengerRepository {

    // only Sql query
    @Autowired
    JdbcTemplate jdbcTemplate;

    //GET ALL PASSENGER
    public List<Passenger> getAllPassengers() {

        // FETCHING DATA FROM PASSENGER TABLE
        String getQuery = "SELECT * FROM passenger";
        List<Passenger> passengers = jdbcTemplate.query(getQuery, new PassengerRowMapper());

        return passengers;
    }
    public int addPassenger(Passenger passenger){
        String queary="insert into passenger values(?,?,?)";
        return jdbcTemplate.update(queary,passenger.getPasssengerId(),passenger.getPassengerName(),passenger.getPasseengerEmail());

    }


    public Passenger getPassengerById(int id) {
        String getQuery = "SELECT * FROM Passenger WHERE ID= ?";
        Passenger passenger = jdbcTemplate.queryForObject(getQuery, new Object[]{id}, new PassengerRowMapper());
        return passenger;


    }

    class PassengerRowMapper implements RowMapper<Passenger> {

        @Override
        public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
            // PASSENGER MAPPING
            Passenger passenger = new Passenger();
            passenger.setPasssengerId(rs.getInt("id"));
            passenger.setPassengerName(rs.getString("name"));
            passenger.setPasseengerEmail(rs.getString("email"));
            return passenger;
        }

    }
}













