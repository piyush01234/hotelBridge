package com.piyush.hotelBridge.repository;

import com.piyush.hotelBridge.entity.Hotel;
import com.piyush.hotelBridge.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByOwner(User user);
}
