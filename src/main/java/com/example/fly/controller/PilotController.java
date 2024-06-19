package com.example.fly.controller;

import com.example.fly.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PilotController {
    @Autowired
    private PilotService pilotService;

    @GetMapping("/pilots/flight-count")
    public String getPilotsWithFlightCount(Model model) {
        List<Object[]> pilotsWithFlightCount = pilotService.getPilotsWithFlightCount();
        model.addAttribute("pilotsWithFlightCount", pilotsWithFlightCount);
        return "pilots";
    }
}
