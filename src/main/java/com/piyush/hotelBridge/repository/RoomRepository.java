package com.piyush.hotelBridge.repository;

import com.piyush.hotelBridge.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
