package com.springboot.hotelmanagement.dto;

import com.springboot.hotelmanagement.enitity.Hotel;
import lombok.Data;

@Data
public class HotelDto {
    private int hotelId;

    private String hotelName;

    private String hotelAddress;

}
