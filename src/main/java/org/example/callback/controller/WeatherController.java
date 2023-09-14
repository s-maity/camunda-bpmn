package org.example.callback.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
public class WeatherController {

    @GetMapping
    public ResponseEntity<WeatherDto> getWeather() {
        System.out.println("Get weather status");
        return new ResponseEntity<>(new WeatherDto(WeatherStatus.BAD.name()), HttpStatus.OK);
    }
}
