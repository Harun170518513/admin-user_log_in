package com.example.kontrol.service;

import com.example.kontrol.model.User;
import com.example.kontrol.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

}
