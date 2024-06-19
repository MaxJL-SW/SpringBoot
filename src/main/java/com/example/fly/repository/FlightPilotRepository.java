package com.example.fly.repository;

import com.example.fly.model.FlightPilot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlightPilotRepository extends JpaRepository<FlightPilot, Long> {
    @Query("SELECT fp.pilot, COUNT(fp.flight) FROM FlightPilot fp GROUP BY fp.pilot ORDER BY COUNT(fp.flight) DESC")
    List<Object[]> findPilotsWithFlightCount();
}
