package com.springboot.hotelmanagement.controller;

import com.springboot.hotelmanagement.enitity.Hotel;
import com.springboot.hotelmanagement.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;


@Controller
@RequestMapping("/hotels")
public class HotelController {

    private HotelService hotelService;

    @Autowired
    public HotelController(HotelService theHotelService){
        hotelService=theHotelService;
    }

    @GetMapping("/showAll")
    public String findAll(Model theModel){
        List<Hotel> Hotels=hotelService.findAll();
        theModel.addAttribute("hotels",Hotels);
        return "hotels/showHotels";
    }

    @GetMapping("showFormForAdd")
    public String showFormForAdd(Model theModel){
        Hotel theHotel= new Hotel();
        theModel.addAttribute("hotel",theHotel);
        return "/hotels/hotel-form";
    }
}
