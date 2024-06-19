package com.example.fly.controller;

import com.example.fly.model.Flight;
import com.example.fly.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/flights/by-airplane")
    public String getFlightsByAirplane(@RequestParam Long airplaneId, Model model) {
        List<Flight> flights = flightService.getFlightsByAirplane(airplaneId);
        model.addAttribute("flights", flights);
        return "flights";
    }

    @GetMapping("/flights/by-period")
    public String getFlightsByPeriod(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime start,
                                     @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime end, Model model) {
        List<Flight> flights = flightService.getFlightsByPeriod(start, end);
        model.addAttribute("flights", flights);
        return "flights";
    }

    @GetMapping("/flights/by-city-and-day")
    public String getFlightsByCityAndDay(@RequestParam Long cityId,
                                         @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startOfDay,
                                         @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endOfDay, Model model) {
        List<Flight> flights = flightService.getFlightsByCityAndDay(cityId, startOfDay, endOfDay);
        model.addAttribute("flights", flights);
        return "flights";
    }
}
