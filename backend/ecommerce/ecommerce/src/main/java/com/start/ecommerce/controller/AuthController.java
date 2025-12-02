package com.start.ecommerce.controller;

import com.start.ecommerce.dto.AuthResponse;
import com.start.ecommerce.dto.LoginRequest;
import com.start.ecommerce.dto.SignupRequest;
import com.start.ecommerce.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public AuthResponse signup(@RequestBody SignupRequest request) {
        return authService.signup(request);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}
