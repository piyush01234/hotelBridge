package com.piyush.hotelBridge.service;

import com.piyush.hotelBridge.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
