package com.start.ecommerce.service;

import com.start.ecommerce.dto.*;

public interface AuthService {
    AuthResponse signup(SignupRequest request);
    AuthResponse login(LoginRequest request);
}
