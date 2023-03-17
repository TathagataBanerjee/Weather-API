package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Weather;

@Repository
public interface WeatherRepo extends MongoRepository<Weather, Integer>{

	

//	@Query("{'_id': ?0}")
	
//	Optional<Weather> findById2(int fg);
	
	
	@Query("{'city': ?0}")
	List<Weather> findByCity(String city);

	
}
