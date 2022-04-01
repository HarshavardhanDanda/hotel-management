package com.springboot.hotelmanagement.repository;

import com.springboot.hotelmanagement.enitity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
    //no code required
}
