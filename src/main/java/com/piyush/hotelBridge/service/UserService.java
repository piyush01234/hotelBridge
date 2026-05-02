package com.piyush.hotelBridge.service;

import com.piyush.hotelBridge.dto.ProfileUpdateRequestDto;
import com.piyush.hotelBridge.dto.UserDto;
import com.piyush.hotelBridge.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
