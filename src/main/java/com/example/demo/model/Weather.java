package com.example.demo.model;


import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="weather")
public class Weather {
    
	private Integer id;
	private Date date;
	private Float lat;
	private Float lon;
	private String city;
	private String state;
	
	private List<Double> temperatures;

	
	
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Weather(Integer id, Date date, Float lat, Float lon, String city, String state, List<Double> temperatures) {
		super();
		this.id = id;
		this.date = date;
		this.lat = lat;
		this.lon = lon;
		this.city = city;
		this.state = state;
		this.temperatures = temperatures;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getLat() {
		return lat;
	}

	public void setLat(Float lat) {
		this.lat = lat;
	}

	public Float getLon() {
		return lon;
	}

	public void setLon(Float lon) {
		this.lon = lon;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Double> getTemperatures() {
		return temperatures;
	}

	public void setTemperatures(List<Double> temperatures) {
		this.temperatures = temperatures;
	}

	@Override
	public String toString() {
		return "Weather [id=" + id + ", date=" + date + ", lat=" + lat + ", lon=" + lon + ", city=" + city + ", state="
				+ state + ", temperatures=" + temperatures + "]";
	}
	
	
	
	
	
	
	
}
