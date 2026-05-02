package com.piyush.hotelBridge.dto;

import com.piyush.hotelBridge.entity.enums.Role;
import lombok.Data;

@Data
public class SignUpRequestDto {
    private String email;
    private String password;
    private String name;
    private Role role;
}
