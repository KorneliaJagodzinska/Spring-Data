package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepo implements CrudRepository<Car, Long> {
}
