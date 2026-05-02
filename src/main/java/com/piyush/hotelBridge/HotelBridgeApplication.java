package com.piyush.hotelBridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HotelBridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelBridgeApplication.class, args);
	}

}
