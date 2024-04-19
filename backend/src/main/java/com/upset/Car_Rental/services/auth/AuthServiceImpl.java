package com.upset.Car_Rental.services.auth;

import com.upset.Car_Rental.dto.SignupRequest;
import com.upset.Car_Rental.dto.UserDto;
import com.upset.Car_Rental.entity.User;
import com.upset.Car_Rental.enums.UserRole;
import com.upset.Car_Rental.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

//    Inject our userRepo
    private final UserRepository userRepository;

    @Override
    public UserDto createCustomer(SignupRequest signupRequest) {
        User user = new User();
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());
        user.setUserRole(UserRole.CUSTOMER);

        User createdUser = userRepository.save(user);
        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());
        return userDto;
    }
}
