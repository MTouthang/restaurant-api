package com.restaurantapi.service;

import com.restaurantapi.model.Restaurant;
import com.restaurantapi.repo.RestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestServiceImp implements RestService{
    @Autowired
    RestRepository restRepository;

    public List<Restaurant> retrieveRest() {
        return (List<Restaurant>) restRepository.findAll();
    }


    public List<String> retrieveRestTypes() {
        return (List<String>) restRepository.findAllRestTypes();
    }


    public String retrieveRestById(Long id) {
        return (String) restRepository.findTypeById(id);
    }


    public List<String> retrieveRestName() {
        return (List<String>) restRepository.findAllName();
    }

    public List<String> retrieveRestLocation(){
        return (List<String>) restRepository.findAllLocation();
    }
    public List<Restaurant> retrieveRestDetail(Long id){
        return (List<Restaurant>) restRepository.findRestDetail(id);
    }
}
