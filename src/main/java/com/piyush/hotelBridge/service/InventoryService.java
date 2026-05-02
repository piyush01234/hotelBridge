package com.piyush.hotelBridge.service;

import com.piyush.hotelBridge.dto.*;
import com.piyush.hotelBridge.dto.HotelPriceResponseDto;
import com.piyush.hotelBridge.dto.HotelSearchRequest;
import com.piyush.hotelBridge.dto.InventoryDto;
import com.piyush.hotelBridge.dto.UpdateInventoryRequestDto;
import com.piyush.hotelBridge.entity.Room;
import org.springframework.data.domain.Page;

import java.util.List;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceResponseDto> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDto> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDto updateInventoryRequestDto);
}
