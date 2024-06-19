package com.example.fly.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Flight {
    @Id
    private String flightNumber;
    @ManyToOne
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;
    @ManyToOne
    @JoinColumn(name = "departure_city_id")
    private City departureCity;
    @ManyToOne
    @JoinColumn(name = "arrival_city_id")
    private City arrivalCity;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    // Getters and Setters
}
