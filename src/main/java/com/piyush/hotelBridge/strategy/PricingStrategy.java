package com.piyush.hotelBridge.strategy;

import com.piyush.hotelBridge.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
