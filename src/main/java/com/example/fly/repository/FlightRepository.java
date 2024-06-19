package com.example.fly.repository;

import com.example.fly.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, String> {
    List<Flight> findByAirplaneIdOrderByDepartureTime(Long airplaneId);
    List<Flight> findByDepartureTimeBetween(LocalDateTime start, LocalDateTime end);
    List<Flight> findByDepartureCityIdAndDepartureTimeBetween(Long cityId, LocalDateTime start, LocalDateTime end);
}
