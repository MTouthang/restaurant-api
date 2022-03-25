package com.restaurantapi.service;

import com.restaurantapi.model.Restaurant;

import java.util.List;

public interface RestService {
    List<Restaurant> retrieveRest();
    List<String> retrieveRestTypes();
    String retrieveRestById(Long id);
    List<String> retrieveRestName();
    List<String> retrieveRestLocation();
    List<Restaurant> retrieveRestDetail(Long id);
}
