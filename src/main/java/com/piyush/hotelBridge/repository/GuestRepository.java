package com.piyush.hotelBridge.repository;

import com.piyush.hotelBridge.entity.Guest;
import com.piyush.hotelBridge.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}