package com.example.fly.service;

import com.example.fly.model.Flight;
import com.example.fly.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getFlightsByAirplane(Long airplaneId) {
        return flightRepository.findByAirplaneIdOrderByDepartureTime(airplaneId);
    }

    public List<Flight> getFlightsByPeriod(LocalDateTime start, LocalDateTime end) {
        return flightRepository.findByDepartureTimeBetween(start, end);
    }

    public List<Flight> getFlightsByCityAndDay(Long cityId, LocalDateTime startOfDay, LocalDateTime endOfDay) {
        return flightRepository.findByDepartureCityIdAndDepartureTimeBetween(cityId, startOfDay, endOfDay);
    }
}
