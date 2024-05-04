package com.mefisto.weather.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class WeatherController {

    @GetMapping("/api/v1/forecast")
    public String getMethodName(@RequestParam String city) {
        return new String("Clima en " + city + " para hoy.");
    }
    

}
