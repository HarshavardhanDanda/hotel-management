package com.springboot.hotelmanagement.service;

import com.springboot.hotelmanagement.dto.HotelDto;
import com.springboot.hotelmanagement.enitity.Hotel;

import java.util.List;

public interface HotelService{
    public List<Hotel> findAll();

    public Hotel findById(int theId);

    public void save(Hotel theHotel);

    public void deleteById(int theId);

    List<HotelDto> getAllHotels();
}
