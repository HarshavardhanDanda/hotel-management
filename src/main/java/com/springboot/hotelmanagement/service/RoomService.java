package com.springboot.hotelmanagement.service;

import com.springboot.hotelmanagement.enitity.Room;

import java.util.List;

public interface RoomService {

    public List<Room> findAll();

    public Room findById(int theId);

    public void save(Room theRoom);

    public void deleteById(int theId);
}
