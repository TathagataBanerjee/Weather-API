package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Weather;
import com.example.demo.repository.WeatherRepo;


@RestController
public class WeatherApi2 {

@Autowired
WeatherRepo weatherRepo;
	
@PostMapping("/weather")
public ResponseEntity<String> post(@RequestBody Weather weather_data)
{
	List<Weather> all_data=weatherRepo.findAll();
	
	int c=all_data.size();
	
	weather_data.setId(c+1);
	
	weatherRepo.save(weather_data);
	
	return ResponseEntity.status(HttpStatus.CREATED).body("created");
}

@GetMapping("/weather")
public ResponseEntity<List<Weather>> get()
{
	return ResponseEntity.status(HttpStatus.OK).body(weatherRepo.findAll());
}

@GetMapping("/weather/{id}")
public ResponseEntity<Optional<Weather>> get_by_id(@PathVariable Integer id)
{
	Optional<Weather> body=weatherRepo.findById(id);
	return ResponseEntity.status(HttpStatus.OK).body(body);
}

@GetMapping("/weather2/{city}")
public ResponseEntity<List<Weather>> get_by_city(@PathVariable String city)
{
	List<Weather> listbody=weatherRepo.findByCity(city);

	return ResponseEntity.status(HttpStatus.OK).body(listbody);
}


}
