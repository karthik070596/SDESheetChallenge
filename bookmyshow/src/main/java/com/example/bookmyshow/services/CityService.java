package com.example.bookmyshow.services;

import com.example.bookmyshow.models.City;
import com.example.bookmyshow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    private CityRepository cityRepository;
    @Autowired
    public CityService(CityRepository cityRepository)
    {
        this.cityRepository=cityRepository;
    }

    public City createCity(String name) {
        City city=new City();
        city.setName(name);
        City createdCity=this.cityRepository.save(city);
        return createdCity;
    }
}
