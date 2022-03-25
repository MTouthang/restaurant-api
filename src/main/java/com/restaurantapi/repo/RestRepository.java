package com.restaurantapi.repo;

import com.restaurantapi.model.Restaurant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestRepository extends CrudRepository<Restaurant, Long> {

    @Query("select d.id, d.type from Restaurant d where d.id=:id")
    String findTypeById(Long id);

    @Query("select d.id, d.type from Restaurant d")
    List<String> findAllRestTypes();

    @Query("select d.id, d.name from Restaurant d")
    List<String> findAllName();

    @Query("select d.id, d.location from Restaurant d")
    List<String> findAllLocation();

    @Query("select d.id, d.type, d.location from Restaurant d where d.id=:id")
    List<Restaurant> findRestDetail(Long id);
}
