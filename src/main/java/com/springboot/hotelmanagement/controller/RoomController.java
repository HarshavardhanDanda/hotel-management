package com.springboot.hotelmanagement.controller;

import com.springboot.hotelmanagement.enitity.Room;
import com.springboot.hotelmanagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;


@Controller
@RequestMapping("/rooms")
public class RoomController {
    private RoomService roomService;

    @Autowired
    public RoomController(RoomService theRoomService){
        roomService=theRoomService;
    }

    @GetMapping("showAll")
    public String findAll(Model theModel){
        List<Room> Rooms= roomService.findAll();
        theModel.addAttribute("rooms",Rooms);
        return "rooms/showRooms";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        Room theRoom= new Room();
        theModel.addAttribute("room",theRoom);
        return "/rooms/room-form";
    }


}
