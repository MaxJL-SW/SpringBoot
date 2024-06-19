package com.example.fly.service;

import com.example.fly.model.Pilot;
import com.example.fly.repository.FlightPilotRepository;
import com.example.fly.repository.PilotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotService {
    @Autowired
    private PilotRepository pilotRepository;
    @Autowired
    private FlightPilotRepository flightPilotRepository;

    public List<Object[]> getPilotsWithFlightCount() {
        return flightPilotRepository.findPilotsWithFlightCount();
    }

    public List<Pilot> getAllPilots() {
        return pilotRepository.findAll();
    }

    // Other CRUD operations
}
