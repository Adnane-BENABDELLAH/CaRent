package com.upset.Car_Rental.dto;

import com.upset.Car_Rental.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String name;
    private String email;
    private UserRole userRole;
}
