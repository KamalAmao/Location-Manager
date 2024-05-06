package com.thatblackbwoy.locationmanager.service;

import com.thatblackbwoy.locationmanager.model.Location;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class LocationService {
    public List<Location> locations(){
        return Stream.of(
                new Location(1, "Ajah", 0.0200, 0.1111),
                new Location(2, "Lekki", 0.0230, 0.228),
                new Location(3, "ikeja", 0.1230, 0.328)

        ).collect(Collectors.toList());
    }
}
