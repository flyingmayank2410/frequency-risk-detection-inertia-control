package com.siemens.proton.hackx.controller;

import com.siemens.proton.hackx.response.APIResponse;
import com.siemens.proton.hackx.service.FrequencyRiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class WeatherController {


    @Autowired
    private FrequencyRiskService weatherService;

    // This class will handle HTTP requests related to weather data.
    // It will use the WeatherService to fetch and return weather information.
    // Additional methods for handling specific endpoints can be added here.

    @GetMapping("/weather")
    public ResponseEntity<APIResponse> getWeatherData(String latitude, String longitude) {
        // This method will interact with the WeatherService to fetch weather data for the given location.
        // It will return a ResponseEntity containing the APIResponse with the weather data.
        return ResponseEntity.ok(weatherService.getWeatherData(latitude, longitude));
    }
}
