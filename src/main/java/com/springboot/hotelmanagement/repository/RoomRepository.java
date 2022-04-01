package com.springboot.hotelmanagement.repository;

import com.springboot.hotelmanagement.enitity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    //no code required
}
