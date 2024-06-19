package com.example.fly.model;

import javax.persistence.*;

@Entity
@IdClass(FlightPilotId.class)
public class FlightPilot {
    @Id
    @ManyToOne
    @JoinColumn(name = "pilot_id")
    private Pilot pilot;

    @Id
    @ManyToOne
    @JoinColumn(name = "flight_number")
    private Flight flight;

    // Getters and Setters
}
