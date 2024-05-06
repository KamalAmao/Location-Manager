package com.thatblackbwoy.locationmanager.controller;

import com.thatblackbwoy.locationmanager.model.Location;
import com.thatblackbwoy.locationmanager.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class LocationController {
    private final LocationService locationService;

    @GetMapping("/locations")
    public ResponseEntity<List<Location>> locations(){
        return ResponseEntity.ok().body(locationService.locations());
    }
    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok().body("Welcome");
    }
}
