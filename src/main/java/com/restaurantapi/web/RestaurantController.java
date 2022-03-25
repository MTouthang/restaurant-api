package com.restaurantapi.web;

import com.restaurantapi.model.Restaurant;
import com.restaurantapi.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    private RestService restService;

    @Autowired
    public RestaurantController(RestService restService) {
        this.restService = restService;
    }

    /**
     * @return all the restaurant details
     */
    @GetMapping("/restaurants/")
    public ResponseEntity<List<Restaurant>> getAllRestaurant() {
        List<Restaurant> list = restService.retrieveRest();
        return new ResponseEntity<List<Restaurant>>(list, HttpStatus.OK);
    }

    /**
     * @return all the types of restaurant
     */
    @GetMapping("restaurant/types/")
    public ResponseEntity<List<String>> getAllTypes(){
        List<String> list = restService.retrieveRestTypes();
        return new ResponseEntity<List<String>>(list,HttpStatus.OK);
    }

    @GetMapping("/{id}/restaurant/")
    public ResponseEntity<String> getRestById(@PathVariable Long id){
        String restId = restService.retrieveRestById(id);
        return new ResponseEntity<String>(restId, HttpStatus.OK);
    }

    @GetMapping("/restaurant/name")
    public ResponseEntity<List<String>> getRestNames(){
        List<String> list = restService.retrieveRestName();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/restaurant/locations")
    public ResponseEntity<List<String>> getRestLocation(){
        List<String> list = restService.retrieveRestLocation();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }
    @GetMapping("/restaurant/{id}/detail")
    public ResponseEntity<List<Restaurant>> getRestDetail(@PathVariable Long id){
        List<Restaurant> rest = restService.retrieveRestDetail(id);
        return new ResponseEntity<List<Restaurant>>(rest, HttpStatus.OK);
    }
}
