package com.example.fly.model;

import javax.persistence.*;

@Entity
public class Pilot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;

    // Getters and Setters
}
