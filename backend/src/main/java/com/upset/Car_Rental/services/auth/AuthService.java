package com.upset.Car_Rental.services.auth;

import com.upset.Car_Rental.dto.SignupRequest;
import com.upset.Car_Rental.dto.UserDto;

public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest);
}
